package co.edu.uniquindio.biblioteca.parcial1.model;

public class EmpleadoBuilder {
    private String nombre;
    private int id;

    public EmpleadoBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }
    public EmpleadoBuilder id(int id) {
        this.id = id;
        return this;
    }
    public Empleado build() {
        return new Empleado(nombre, id);
    }
}
