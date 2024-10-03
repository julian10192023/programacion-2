package co.edu.uniquindio.PatronAbstractFactory.fabricas;

import co.edu.uniquindio.PatronAbstractFactory.services.Iauto;
import co.edu.uniquindio.PatronAbstractFactory.services.Imoto;

public interface IfabricaVehiculo {
    Iauto crearAuto();
    Imoto crearMoto();
}
