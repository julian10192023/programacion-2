package co.edu.uniquindio.preparcial2.patron.model;

public class Producto {
    private String nombre;
    private String imagen;
    private String categoria;
    private double precio;
    private EstadoProducto estado;

    public enum EstadoProducto {
        VENDIDO, PUBLICADO, CANCELADO
    }

    public Producto(String nombre, String imagen, String categoria, double precio) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.categoria = categoria;
        this.precio = precio;
        this.estado = EstadoProducto.PUBLICADO;
    }

    // Getters and setters
    // ...
}