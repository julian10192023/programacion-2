package co.edu.uniquindio.biblioteca.parcial1;

import co.edu.uniquindio.biblioteca.parcial1.factory.ModelFactory;

public class Main {
    public static void main(String[] args) {

        ModelFactory modelFactory = ModelFactory.getInstance();
        //mostrarDisponiblidadLibro(modelFactory);
        //mostarMiembrosMayores(modelFactory);
        //buscarMiembro(modelFactory);
        crudMiembro(modelFactory);
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
    private static void crudMiembro(ModelFactory modelFactory) {
        crearMiembro(modelFactory);
        eliminarMiembro(modelFactory);
    }
    private static void crearMiembro(ModelFactory modelFactory) {
        String nombre = "JULIAN";
        int id = 1005159227;
        int edad = 18;
        boolean resultado = modelFactory.crearMiembro(nombre, id, edad);
        notificacion(resultado, " creado ");
    }
    private static void eliminarMiembro(ModelFactory modelFactory) {
        int id = 00000000;
        boolean resultado = modelFactory.eliminarMiembro(id);
        notificacion(resultado, " eliminado ");
    }
    private static void notificacion(boolean resultado, String mensaje) {
        if (resultado == true) {
            System.out.println("Miembro" + mensaje + "con exito");
        } else {
            System.out.println("Miembro NO" + mensaje + "porque no existe");
        }
    }
}
