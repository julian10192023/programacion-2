package co.edu.uniquindio.preparcial2.preparcial2.model;

import co.edu.uniquindio.preparcial2.preparcial2.model.builder.ObjetoBuilder;

public class Objeto extends Prestamo {
    private String nombre;
    PrestamoUq ownedByPrestamoUq;

    public Objeto() {
    }

    public Objeto(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public PrestamoUq getOwnedByPrestamoUq() {
        return ownedByPrestamoUq;
    }

    public void setOwnedByPrestamoUq(PrestamoUq ownedByPrestamoUq) {
        this.ownedByPrestamoUq = ownedByPrestamoUq;
    }
    public static ObjetoBuilder builder(){
        return new ObjetoBuilder();
    }

    @Override
    public String toString() {
        return "Objeto{" +
                "nombre='" + nombre + '\'' +
                ", ownedByPrestamoUq=" + ownedByPrestamoUq +
                '}';
    }
}
