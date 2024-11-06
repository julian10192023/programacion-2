package co.edu.uniquindio.preparcial2.patron.model;

import co.edu.uniquindio.preparcial2.patron.service.IaplicacionMovil;

public class AplicacionMovil implements IaplicacionMovil {
    @Override
    public void aplicacionesAndroid() {
        System.out.println("creando aplicacion para clientes que buscan llegar a una " +
                "audicencia mas amplia en dispositivos moviles");

    }
    @Override
    public void aplicacionesIos() {
        System.out.println("creando aplicacion para empresas que desean ofrecer una experiencia" +
                "de usuario excepcional en dispositivos Apple");

    }
    @Override
    public void aplicacionesMultiplataforma() {
        System.out.println("creando aplicacion para clientes que necesitan llegar a diferentes" +
                "sistemas operativos con una solucion");

    }
}
