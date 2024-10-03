package co.edu.uniquindio.PatronAbstractFactory.model;

import co.edu.uniquindio.PatronAbstractFactory.services.Imoto;

public class MotoGasolina implements Imoto {
    @Override
    public void conducir() {
        System.out.println("CONDUCIENDO MOTO A GASOLINA");
    }
}
