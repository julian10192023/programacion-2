package co.edu.uniquindio.biblioteca.model;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private List<Libro>listaLibros = new ArrayList();
    private  List<Miembro>listaMiembros = new ArrayList();
    private List<Prestamo>listaPrestamos = new ArrayList();
    private List<Empleado>listaEmpleados = new ArrayList();
    private List<Bibliotecario>listaBibliotecarios = new ArrayList();

    public Biblioteca() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(List<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public List<Miembro> getListaMiembros() {
        return listaMiembros;
    }

    public void setListaMiembros(List<Miembro> listaMiembros) {
        this.listaMiembros = listaMiembros;
    }

    public List<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }

    public void setListaPrestamos(List<Prestamo> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public List<Bibliotecario> getListaBibliotecarios() {
        return listaBibliotecarios;
    }

    public void setListaBibliotecarios(List<Bibliotecario> listaBibliotecarios) {
        this.listaBibliotecarios = listaBibliotecarios;
    }

    public void mostrarDisponiblidadLibro() {
        for (Libro libro : listaLibros) {
            if (libro.isPrestado()==true){
                System.out.println(libro.getTitulo()+ ":" + \n " NO ESTA DISPONIBLE");
            }
            else{
                System.out.println(libro.getTitulo() + " ESTA DISPONIBLE");
            }
        }
    }
}
