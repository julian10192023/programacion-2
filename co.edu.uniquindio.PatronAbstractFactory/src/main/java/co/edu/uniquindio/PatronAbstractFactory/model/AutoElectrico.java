package co.edu.uniquindio.PatronAbstractFactory.model;

import co.edu.uniquindio.PatronAbstractFactory.services.Iauto;

public class AutoElectrico implements Iauto {
    @Override
    public void conducir() {
        System.out.println("CONDUCIENDO AUTO ELECTRICO");
    }
}
