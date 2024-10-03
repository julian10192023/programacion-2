package co.edu.uniquindio.PatronAbstractFactory.fabricas;

import co.edu.uniquindio.PatronAbstractFactory.model.AutoElectrico;
import co.edu.uniquindio.PatronAbstractFactory.model.MotoElectrica;
import co.edu.uniquindio.PatronAbstractFactory.services.Iauto;
import co.edu.uniquindio.PatronAbstractFactory.services.Imoto;

public class FabricaVehiculoElectrico implements IfabricaVehiculo{
    @Override
    public Iauto crearAuto() {
        return new AutoElectrico();
    }

    @Override
    public Imoto crearMoto() {
        return new MotoElectrica();
    }
}
