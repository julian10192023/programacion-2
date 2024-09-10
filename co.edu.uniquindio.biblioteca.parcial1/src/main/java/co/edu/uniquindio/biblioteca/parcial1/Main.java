package co.edu.uniquindio.biblioteca.parcial1;

import co.edu.uniquindio.biblioteca.parcial1.factory.ModelFactory;

public class Main {
    public static void main(String[] args) {

        ModelFactory modelFactory = ModelFactory.getInstance();
        mostrarDisponiblidadLibro(modelFactory);
        mostarMiembrosMayores(modelFactory);
        buscarMiembro(modelFactory);
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
}