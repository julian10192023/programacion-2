package co.edu.uniquindio.cafeteriafx.cafeteria.model;

public class Cafe {
    double costo;
    String ingredientes;

    public Cafe(double costo, String ingredientes) {
        this.costo = costo;
        this.ingredientes = ingredientes;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        return "Cafe{" +
                "costo=" + costo +
                ", ingredientes='" + ingredientes + '\'' +
                '}';
    }
}
