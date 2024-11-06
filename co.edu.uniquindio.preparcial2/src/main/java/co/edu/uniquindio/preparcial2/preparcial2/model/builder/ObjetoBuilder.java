package co.edu.uniquindio.preparcial2.preparcial2.model.builder;

import co.edu.uniquindio.preparcial2.preparcial2.model.Cliente;
import co.edu.uniquindio.preparcial2.preparcial2.model.Objeto;

public class ObjetoBuilder {
    String nombre;

    public ObjetoBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this; // Devuelve la instancia actual de ObejetoBuilder
    }
    public Objeto build() {
        return new Objeto(nombre);
    }

}
