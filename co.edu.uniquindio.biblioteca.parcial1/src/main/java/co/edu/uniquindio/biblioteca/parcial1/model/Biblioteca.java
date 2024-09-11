package co.edu.uniquindio.biblioteca.parcial1.model;

import co.edu.uniquindio.biblioteca.parcial1.services.IlibroCrud;
import co.edu.uniquindio.biblioteca.parcial1.services.ImiembroCrud;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca implements ImiembroCrud, IlibroCrud {
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
                System.out.println(libro.getTitulo()+ ":" + "\n" + "NO ESTA DISPONIBLE");
            }
            else{
                System.out.println(libro.getTitulo() + ":" + "\n" + "ESTA DISPONIBLE");
            }
        }
    }
    public void mostarMiembrosMayores() {
        for(Miembro miembro : listaMiembros){
            if(miembro.getEdad()>40){
                System.out.println("MIEMBRO MAYOR DE 40 AÑOS:"+"\n" + miembro);
            }
        }
    }

    public void buscarMiembro() {
        boolean encontrado = false;
        int buscarId = 1000192445;
        for(Miembro miembros  : listaMiembros){
            if(miembros.getId()==buscarId){
                System.out.println("MIEMBRO ENCONTRADO: "+"\n" + miembros);
                encontrado = true;
                break;
            }
        }
        if(!encontrado)
            System.out.println("MIEMBRO NO ENCONTRADO");

    }
    @Override
    public boolean crearMiembro(String nombre, int id, int edad) {
        Miembro miembroExistente = obtenerMiembro(id);
        if(miembroExistente==null){
            Miembro miembro = Miembro.builder()
                    .nombre(nombre)
                    .id(id)
                    .edad(edad).build();
            getListaMiembros().add(miembro);
            return true;
        } else{
            return false;
        }
    }
    private Miembro obtenerMiembro(int id) {
        Miembro miembroExistente = null;
        for(Miembro miembro : getListaMiembros()){
            if(miembro.getId()==id){
                miembroExistente = miembro;
                break;
            }
        }
        return miembroExistente;
    }
    @Override
    public boolean eliminarMiembro(int id) {
        Miembro miembroExistente = obtenerMiembro(id);
        if(miembroExistente!=null){
            getListaMiembros().remove(miembroExistente);
            return true;
        }else{
            return false;
        }
    }
    @Override
    public boolean actualizarMiembro(int id, String nombreNuevo, int idNuevo, int edadNueva) {
        Miembro miembroExistente = obtenerMiembro(id);
        if(miembroExistente!=null){
            Miembro.builder()
                    .nombre(nombreNuevo)
                    .id(id)
                    .edad(edadNueva).build();
            return true;
        }else{
            return false;
        }
    }
    @Override
    public List<Miembro> leerMiembros(List<Miembro>listaMiembros) {
        for(Miembro miembro : listaMiembros){
            System.out.println(miembro);
        }
        return listaMiembros;
    }

    @Override
    public boolean crearLibro(String titulo, String autor, String isbn, boolean prestado) {
        return false;
    }
}
