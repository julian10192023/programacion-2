package co.edu.uniquindio.biblioteca.parcial1;

import co.edu.uniquindio.biblioteca.parcial1.factory.ModelFactory;
import co.edu.uniquindio.biblioteca.parcial1.model.Biblioteca;
import co.edu.uniquindio.biblioteca.parcial1.model.Libro;
import co.edu.uniquindio.biblioteca.parcial1.model.Miembro;

import java.util.List;

public class Main {
    private static List<Libro> libro;

    public static void main(String[] args) {

        ModelFactory modelFactory = ModelFactory.getInstance();
        //mostrarDisponiblidadLibro(modelFactory);
        //mostarMiembrosMayores(modelFactory);
        //buscarMiembro(modelFactory/);
        //crudMiembro(modelFactory);
        crudLibro(modelFactory);
    }

    private static void crearRevista(ModelFactory modelFactory) {
    }

    private static void mostrarDisponiblidadLibro(ModelFactory modelFactory) {
        modelFactory.mostrarDisponiblidadLibro();
    }
    private static void mostarMiembrosMayores(ModelFactory modelFactory) {
        modelFactory.mostarMiembrosMayores();
    }
    private static void buscarMiembro(ModelFactory modelFactory) {
        modelFactory.buscarMiembro();
    }
    //CRUD PARA LA CLASE MIEMBRO
    private static void crudMiembro(ModelFactory modelFactory) {
        crearMiembro(modelFactory);
        eliminarMiembro(modelFactory);
        actualizarMiembro(modelFactory);
        mostrarMiembros(modelFactory);
    }
    private static void crearMiembro(ModelFactory modelFactory) {
        String nombre = "JULIAN";
        int id = 1005159227;
        int edad = 18;
        boolean resultado = modelFactory.crearMiembro(nombre, id, edad);
        notificacionMiembro(resultado, " creado ");
    }
    private static void mostrarMiembros(ModelFactory modelFactory) {
        List<Miembro> miembros = modelFactory.getBiblioteca().getListaMiembros();
        modelFactory.leerMiembros(miembros);
    }
    private static void actualizarMiembro(ModelFactory modelFactory) {
        int id= 1235445;
        String nombreNuevo = "JHON";
        int idNuevo = 4404221;
        int edadNueva = 43;
        boolean resultado = modelFactory.actualizarMiembro(id,nombreNuevo,idNuevo,edadNueva);
        notificacionMiembro(resultado, " actualizado ");
    }
    private static void eliminarMiembro(ModelFactory modelFactory) {
        int id = 00000000;
        boolean resultado = modelFactory.eliminarMiembro(id);
        notificacionMiembro(resultado, " eliminado ");
    }
    private static void notificacionMiembro(boolean resultado, String mensaje) {
        if (resultado == true) {
            System.out.println("Miembro" + mensaje + "con exito");
        } else {
            System.out.println("Miembro NO" + mensaje + "porque no existe");
        }
    }
    //CRUD PARA LA CLASE LIBRO
    private static void crudLibro(ModelFactory modelFactory) {
        crearLibro(modelFactory);
        mostrarlibros(modelFactory);
    }
    private static void crearLibro(ModelFactory modelFactory) {
        String titulo = "MAGIA NEGRA";
        String autor = "JUAN PABLO";
        String isbn = "10101010";
        boolean prestado = true;
        boolean resultado = modelFactory.crearLibro(titulo, autor, isbn, prestado);
        notificacionLibro(resultado, " creado ");
    }
    private static void mostrarlibros(ModelFactory modelFactory) {
        boolean resultado = modelFactory.getBiblioteca().mostrarLibros(libro);
        System.out.println(libro);

        //List<ModelFactory>libros=modelFactory.mostrarLibros();
    }

    private static void notificacionLibro(boolean resultado, String mensaje) {
        if (resultado == true) {
            System.out.println("Libro" + mensaje + "con exito");
        } else {
            System.out.println("libro NO" + mensaje + "porque no existe");
        }
    }
}
