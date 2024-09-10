package co.edu.uniquindio.biblioteca.parcial1.model;

public class Empleado {
    private String nombre;
    private int id;

    public Empleado() {
    }
    public Empleado(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                '}';
    }
}

