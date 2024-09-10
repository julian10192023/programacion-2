package co.edu.uniquindio.biblioteca.model;
import co.edu.uniquindio.biblioteca.services.IgestionarInventario;

public class Bibliotecario extends Empleado implements IgestionarInventario {


    public Bibliotecario(String nombre, int id) {
        super(nombre, id);
    }
    public void gestionarPrestamo(){
        System.out.println("GESTIONANDO PRESTAMO");
    }

    @Override
    public void gestionarItem() {
        System.out.println("GESTIONANDO ITEM");
    }
}
