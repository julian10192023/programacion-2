package co.edu.uniquindio.biblioteca.parcial1.services;

public interface IlibroCrud {
    boolean crearLibro(String titulo, String autor, String isbn,boolean prestado);
}
