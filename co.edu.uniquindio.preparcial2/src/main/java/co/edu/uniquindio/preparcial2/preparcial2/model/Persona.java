package co.edu.uniquindio.preparcial2.preparcial2.model;

public class Persona {
    private String nombre;
    private String apellido;
    private String cedula;
    private String edad;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String cedula, String edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }


    public void indicarEdad(){
        System.out.println("Hola mi edad es: " + this.edad);
    }
}
