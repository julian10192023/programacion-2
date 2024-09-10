package co.edu.uniquindio.biblioteca.model;

public class LibroBuilder {

    private String titulo;
    private String autor;
    private String isbn;
    private boolean prestado;

    public LibroBuilder titulo(String titulo) {
        this.titulo = titulo;
        return this;
    }
    public LibroBuilder autor(String autor) {
        this.autor = autor;
        return this;
    }
    public LibroBuilder isbn(String isbn) {
        this.isbn = isbn;
        return this;
    }
    public LibroBuilder prestado(boolean prestado) {
        this.prestado = prestado;
        return this;
    }
    public Libro build() {
        return new Libro(titulo, autor, isbn, prestado);
    }
}
