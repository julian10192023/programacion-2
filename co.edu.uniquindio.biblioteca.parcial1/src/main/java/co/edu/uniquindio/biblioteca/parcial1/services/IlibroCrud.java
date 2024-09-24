package co.edu.uniquindio.biblioteca.parcial1.services;

import co.edu.uniquindio.biblioteca.parcial1.model.Libro;

import java.util.List;

public interface IlibroCrud {
    boolean crearLibro(String titulo, String autor, String isbn,boolean prestado);
    boolean mostrarLibros(List<Libro>listaLibros);
}
