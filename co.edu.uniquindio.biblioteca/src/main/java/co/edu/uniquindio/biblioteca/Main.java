package co.edu.uniquindio.biblioteca;

import co.edu.uniquindio.biblioteca.factory.ModelFactory;
import co.edu.uniquindio.biblioteca.model.Libro;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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