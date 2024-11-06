package co.edu.uniquindio.preparcial2.preparcial2.model.builder;

import co.edu.uniquindio.preparcial2.preparcial2.model.Cliente;

public class ClienteBuilder {
    protected String nombre;
    protected String apellido;
    protected String cedula;
    protected String edad;


    public ClienteBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this; // Devuelve la instancia actual de ClienteBuilder
    }

    public ClienteBuilder apellido(String apellido) {
        this.apellido = apellido;
        return this; // Devuelve la instancia actual de ClienteBuilder
    }
    public ClienteBuilder cedula(String cedula) {
        this.cedula = cedula;
        return this; // Devuelve la instancia actual de ClienteBuilder
    }
    public ClienteBuilder edad(String edad) {
        this.edad = edad;
        return this; // Devuelve la instancia actual de ClienteBuilder
    }

    public Cliente build() {
        return new Cliente(cedula, nombre, apellido,edad);
    }
}
