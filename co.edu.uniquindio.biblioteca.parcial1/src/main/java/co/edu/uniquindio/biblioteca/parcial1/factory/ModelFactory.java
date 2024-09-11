package co.edu.uniquindio.biblioteca.parcial1.factory;

import co.edu.uniquindio.biblioteca.parcial1.model.*;
import co.edu.uniquindio.biblioteca.parcial1.model.Biblioteca;
import co.edu.uniquindio.biblioteca.parcial1.services.IlibroCrud;
import co.edu.uniquindio.biblioteca.parcial1.services.ImiembroCrud;

import java.time.LocalDate;
import java.util.List;


public class ModelFactory implements ImiembroCrud, IlibroCrud {

    private static ModelFactory modelFactory;
    private Biblioteca biblioteca;

    private ModelFactory(){
        inicializarDatos();
    }
    public static ModelFactory getInstance(){
        if(modelFactory == null){
            modelFactory = new ModelFactory();
        }
        return modelFactory;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }
    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public void mostrarDisponiblidadLibro(){
        biblioteca.mostrarDisponiblidadLibro();
    }
    public void mostarMiembrosMayores() {
        biblioteca.mostarMiembrosMayores();
    }
    public void buscarMiembro() {
        biblioteca.buscarMiembro();
    }
    @Override
    public boolean crearMiembro(String nombre, int id, int edad) {
        return biblioteca.crearMiembro(nombre, id, edad);
    }

    @Override
    public boolean eliminarMiembro(int id) {
        return biblioteca.eliminarMiembro(id);
    }
    @Override
    public boolean actualizarMiembro(int id, String nombreNuevo, int idNuevo, int edadNueva) {
        return biblioteca.actualizarMiembro(id, nombreNuevo, idNuevo, edadNueva);
    }

    @Override
    public List<Miembro> leerMiembros(List<Miembro>listaMiembros) {
        return biblioteca.leerMiembros(listaMiembros);
    }
    @Override
    public boolean crearLibro(String titulo, String autor, String isbn,boolean prestado) {
        return biblioteca.crearLibro(titulo, autor, isbn, prestado);
    }

    private void inicializarDatos() {
        biblioteca = new Biblioteca();
        Libro libro1 = Libro.builder()
                .titulo("CIEN AÑOS DE SOLEDAD")
                .autor("Gabriel García Márquez")
                .isbn("978-958-42-7450-2")
                .prestado(true).build();
        Libro libro2 = Libro.builder()
                .titulo("")
                .autor("")
                .isbn("")
                .prestado(false).build();
        Libro libro3 = Libro.builder().titulo("Cien años de soledad")
                .autor("Gabriel García Márquez")
                .isbn(" 978-958-5457-60-6")
                .prestado(true).build();
        Libro libro4 = Libro.builder().titulo("La vorágine")
                .autor("Gabriel García Márquez")
                .isbn("78-958-38-0215-3")
                .prestado(false).build();
        Libro libro5 = Libro.builder().titulo("Rosario Tijeras")
                .autor("Jorge Franco")
                .isbn("978-958-704-993-9")
                .prestado(true).build();
        biblioteca.getListaLibros().add(libro1);
        biblioteca.getListaLibros().add(libro2);
        biblioteca.getListaLibros().add(libro3);
        biblioteca.getListaLibros().add(libro4);
        biblioteca.getListaLibros().add(libro5);
        Miembro miembro1 = Miembro.builder()
                .nombre("julian")
                .id(1000192445)
                .edad(25).build();
        Miembro miembro2 = Miembro.builder()
                .nombre("andy")
                .id(1235445)
                .edad(25).build();
        Miembro miembro3 = Miembro.builder()
                .nombre("camilo")
                .id(867537909)
                .edad(35).build();
        Miembro miembro4 = Miembro.builder()
                .nombre("juliana")
                .id(123)
                .edad(42).build();
        Miembro miembro5 =Miembro.builder().nombre("camila")
                .id(30975325)
                .edad(50).build();
        biblioteca.getListaMiembros().add(miembro1);
        biblioteca.getListaMiembros().add(miembro2);
        biblioteca.getListaMiembros().add(miembro3);
        biblioteca.getListaMiembros().add(miembro4);
        biblioteca.getListaMiembros().add(miembro5);
        Prestamo prestamo1 = new Prestamo();
        prestamo1.setLibro(libro1);
        prestamo1.setMiembro(miembro1);
        prestamo1.setInicioPrestamo(LocalDate.EPOCH);
        prestamo1.setFinPrestamo(LocalDate.now());
        Prestamo prestamo2 = new Prestamo();
        prestamo2.setLibro(libro2);
        prestamo2.setMiembro(miembro2);
        prestamo2.setInicioPrestamo(LocalDate.now());
        prestamo2.setFinPrestamo(LocalDate.now());
        Prestamo prestamo3 = new Prestamo();
        prestamo3.setLibro(libro3);
        prestamo3.setMiembro(miembro3);
        prestamo3.setInicioPrestamo(LocalDate.now());
        prestamo3.setFinPrestamo(LocalDate.now());
        biblioteca.getListaPrestamos().add(prestamo1);
        biblioteca.getListaPrestamos().add(prestamo2);
        biblioteca.getListaPrestamos().add(prestamo3);
    }
}

