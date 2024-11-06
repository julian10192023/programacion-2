package co.edu.uniquindio.preparcial2.patron;

import co.edu.uniquindio.preparcial2.patron.metodoFactory.AplicacionMovilFactory;
import co.edu.uniquindio.preparcial2.patron.metodoFactory.GestionEmpresarialFactory;
import co.edu.uniquindio.preparcial2.patron.metodoFactory.ServicioFactory;

public class Main {
    public static void main(String[] args) {

        ServicioFactory aplicacionFactory = new AplicacionMovilFactory();
        aplicacionFactory.servicioOfrecido();

        ServicioFactory gestionEmpresarial = new GestionEmpresarialFactory();
        gestionEmpresarial.servicioOfrecido();

    }
}