package co.edu.uniquindio.PatronPrototype.model;

import co.edu.uniquindio.PatronPrototype.services.IclonarPrototipo;

public class Persona implements IclonarPrototipo {
    String nombre;
    int edad;

    public Persona() {
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    @Override
    public Persona clonarObjeto() {
        try {
            return (Persona) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }return null;
    }
}
