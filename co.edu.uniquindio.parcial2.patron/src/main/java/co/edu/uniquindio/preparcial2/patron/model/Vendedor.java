package co.edu.uniquindio.preparcial2.patron.model;

import java.util.ArrayList;
import java.util.List;

public class Vendedor {
    private String nombre;
    private String apellidos;
    private String cedula;
    private String direccion;
    private String usuario;
    private String contrasena;
    private List<Producto> productos;
    private List<Vendedor> aliados;

    public Vendedor(String nombre, String apellidos, String cedula, String direccion, String usuario, String contrasena) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.direccion = direccion;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.productos = new ArrayList<>();
        this.aliados = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void agregarAliado(Vendedor aliado) {
        if (aliados.size() < 10 && !aliados.contains(aliado)) {
            aliados.add(aliado);
            aliado.agregarAliadoBidireccional(this);
        }
    }

    private void agregarAliadoBidireccional(Vendedor aliado) {
        if (aliados.size() < 10 && !aliados.contains(aliado)) {
            aliados.add(aliado);
        }
    }

    // Getters and setters
    // ...
}