package co.edu.uniquindio.PatronAbstractFactory.fabricas;

import co.edu.uniquindio.PatronAbstractFactory.model.AutoGasolina;
import co.edu.uniquindio.PatronAbstractFactory.model.MotoGasolina;
import co.edu.uniquindio.PatronAbstractFactory.services.Iauto;
import co.edu.uniquindio.PatronAbstractFactory.services.Imoto;

public class FabricaVehiculoGasolina implements IfabricaVehiculo{
    @Override
    public Iauto crearAuto() {
        return new AutoGasolina();
    }

    @Override
    public Imoto crearMoto() {
        return new MotoGasolina();
    }
}
