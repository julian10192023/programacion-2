package co.edu.uniquindio.biblioteca.parcial1.model;

public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean prestado;

    public Libro() {
    }
    public Libro(String titulo, String autor, String isbn, boolean prestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.prestado = prestado;
    }
    public static LibroBuilder builder(){
        return new LibroBuilder();}

    public String getTitulo() {
        return titulo;
    }
    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn='" + isbn + '\'' +
                ", prestado=" + prestado +
                '}';
    }
    public boolean isPrestado() {
        return prestado;
    }
}
