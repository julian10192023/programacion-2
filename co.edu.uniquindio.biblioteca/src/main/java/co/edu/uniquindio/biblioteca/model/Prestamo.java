package co.edu.uniquindio.biblioteca.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Prestamo {
    private Libro libro;
    private Miembro miembro;
    private LocalDate inicioPrestamo;
    private LocalDate finPrestamo;

    public Prestamo() {
    }
    public Prestamo(Libro libro, Miembro miembro, LocalDate inicioPrestamo, LocalDate finPrestamo) {
        this.libro = libro;
        this.miembro = miembro;
        this.inicioPrestamo = inicioPrestamo;
        this.finPrestamo = finPrestamo;
    }
    public Libro getLibro() {
        return libro;
    }
    public void setLibro(Libro libro) {
        this.libro = libro;
    }
    public Miembro getMiembro() {
        return miembro;
    }
    public void setMiembro(Miembro miembro) {
        this.miembro = miembro;
    }
    public LocalDate getInicioPrestamo() {
        return inicioPrestamo;
    }
    public void setInicioPrestamo(LocalDate inicioPrestamo) {
        this.inicioPrestamo = inicioPrestamo;
    }
    public LocalDate getFinPrestamo() {
        return finPrestamo;
    }
    public void setFinPrestamo(LocalDate finPrestamo) {
        this.finPrestamo = finPrestamo;
    }
    @Override
    public String toString() {
        return "Prestamo{" +
                "libro=" + libro +
                ", miembro=" + miembro +
                ", inicioPrestamo=" + inicioPrestamo +
                ", finPrestamo=" + finPrestamo +
                '}';
    }
}
