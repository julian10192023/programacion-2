package co.edu.uniquindio.preparcial2.patron.model;

import co.edu.uniquindio.preparcial2.patron.service.IgestionEmpresarial;

public class GestionEmpresarial implements IgestionEmpresarial {

    @Override
    public void sistemaCrm() {
        System.out.println("creando sistema de gestion empresarial CRM, para mejorar  las relaciones" +
                "con los clientes y aumentar las ventas");
    }
    @Override
    public void sitemaErp() {
        System.out.println("creando sistema de gestion empresarial ERP, para integrar" +
                "y gestionar los procesos comerciales de una empresa de manera eficiente");

    }
    @Override
    public void sistemaGestionProyecto() {
        System.out.println("creando sistema de gestion empresarial de gestion de proyectos," +
                "para coordinar y optimizar el trabajo en equipo en proyectos coomplejos");

    }
}
