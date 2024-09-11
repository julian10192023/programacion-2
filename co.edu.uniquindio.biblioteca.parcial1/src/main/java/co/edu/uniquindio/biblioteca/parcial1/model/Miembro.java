package co.edu.uniquindio.biblioteca.parcial1.model;

import java.util.ArrayList;
import java.util.List;

public class Miembro {
    private String nombre;
    private int id;
    private int edad;
    private List<Prestamo>ListaPrestamosAsociados = new ArrayList<Prestamo>();

    public Miembro() {
    }
    public Miembro(String nombre, int id, int edad) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
    }
    public static MiembroBuilder builder(){return  new MiembroBuilder();}

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }
    public int getEdad() {
        return edad;
    }
    @Override
    public String toString() {
        return "Miembro{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                ", edad=" + edad +
                '}';
    }
}
