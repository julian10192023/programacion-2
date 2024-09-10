package co.edu.uniquindio.biblioteca.parcial1.services;

public interface ImiembroCrud {

    boolean crearMiembro(String nombre, int id, int edad );
    boolean eliminarMiembro(int id);
}
