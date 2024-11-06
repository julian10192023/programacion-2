package co.edu.uniquindio.preparcial2.preparcial2.model;

import co.edu.uniquindio.preparcial2.preparcial2.model.builder.ClienteBuilder;

public class Cliente extends Persona{

    public Cliente(String nombre, String apellido, String cedula, String edad) {
        super(nombre, apellido, cedula, edad);
    }

    public Cliente(String nombre) {
    }

    public static ClienteBuilder builder(){
        return new ClienteBuilder();
    }

}
