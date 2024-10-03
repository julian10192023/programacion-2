package co.edu.uniquindio.PatronAbstractFactory;

import co.edu.uniquindio.PatronAbstractFactory.fabricas.FabricaVehiculoElectrico;
import co.edu.uniquindio.PatronAbstractFactory.fabricas.FabricaVehiculoGasolina;
import co.edu.uniquindio.PatronAbstractFactory.fabricas.IfabricaVehiculo;
import co.edu.uniquindio.PatronAbstractFactory.services.Iauto;
import co.edu.uniquindio.PatronAbstractFactory.services.Imoto;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //crear fabrica de vehiculos electricos
        IfabricaVehiculo fabricaElectrica = new FabricaVehiculoElectrico();
        Iauto autoElectrico = fabricaElectrica.crearAuto();
        Imoto motoElectrica = fabricaElectrica.crearMoto();

        //usar los vehiculos electricos
        autoElectrico.conducir();
        motoElectrica.conducir();

        //CREAR UNA FABRICA DE VEHICULOS A GASOLINA
        IfabricaVehiculo fabricaGasolina = new FabricaVehiculoGasolina();
        Iauto autoGasolina = fabricaGasolina.crearAuto();
        Imoto motoGasolina = fabricaGasolina.crearMoto();

        //USAR LOS VEHICULOS A GASOLINA
        autoGasolina.conducir();
        motoGasolina.conducir();
    }
}