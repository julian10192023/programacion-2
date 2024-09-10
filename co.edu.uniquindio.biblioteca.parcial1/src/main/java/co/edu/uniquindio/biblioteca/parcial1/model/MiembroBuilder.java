package co.edu.uniquindio.biblioteca.parcial1.model;

public class MiembroBuilder {
    private String nombre;
    private int id;
    private int edad;

    public MiembroBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }
    public MiembroBuilder id(int id) {
        this.id = id;
        return this;
    }
    public MiembroBuilder edad(int edad) {
        this.edad = edad;
        return this;
    }
    public Miembro build() {
        return new Miembro(nombre, id, edad);
    }
}
