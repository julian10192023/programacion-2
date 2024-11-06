package co.edu.uniquindio.preparcial2.patron.metodoFactory;

import co.edu.uniquindio.preparcial2.patron.service.IaplicacionMovil;
import co.edu.uniquindio.preparcial2.patron.service.IgestionEmpresarial;

public abstract class ServicioFactory {
    abstract IaplicacionMovil ofrecerServicio();

    public void servicioOfrecido() {
        IaplicacionMovil app = ofrecerServicio();
        System.out.println("APLICACION CREADA");
        app.aplicacionesAndroid();
        app.aplicacionesIos();
        app.aplicacionesMultiplataforma();
    }
}
