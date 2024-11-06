package co.edu.uniquindio.preparcial2.preparcial2.utils;

import co.edu.uniquindio.preparcial2.preparcial2.model.Cliente;
import co.edu.uniquindio.preparcial2.preparcial2.model.PrestamoUq;
import co.edu.uniquindio.preparcial2.preparcial2.model.Objeto;


public class DataUtil {

    public static PrestamoUq inicializarDatos(){
        PrestamoUq prestamoUq = new PrestamoUq();
        Cliente cliente1 = Cliente.builder()
                .nombre("JULIAN")
                .apellido("GRACIANO")
                .cedula("1094")
                .edad("23")
                .build();

        Cliente cliente2 = Cliente.builder()
                
                .nombre("NATALIA")
                .apellido("LOPEZ")
                .cedula("1095")
                .edad("24")
                .build();

        Cliente cliente3 = Cliente.builder()
                .nombre("JHON")
                .apellido("GRACIANO")
                .cedula("1096")
                .edad("43")
                .build();

        Objeto objeto1 = Objeto.builder()
                        .nombre("objeto1")
                        .build();

        Objeto objeto2 = Objeto.builder()
                .nombre("objeto2")
                .build();

        Objeto objeto3 = Objeto.builder()
                .nombre("objeto3")
                .build();

        Objeto objeto4 = Objeto.builder()
                .nombre("objeto4")
                .build();

        Objeto objeto5 = Objeto.builder()
                .nombre("objeto5")
                .build();

        Objeto objeto6 = Objeto.builder()
                .nombre("objeto6")
                .build();

        Objeto objeto7 = Objeto.builder()
                .nombre("objeto7")
                .build();

        Objeto objeto8 = Objeto.builder()
                .nombre("objeto8")
                .build();

        Objeto objeto9 = Objeto.builder()
                .nombre("objeto9")
                .build();

        Objeto objeto10 = Objeto.builder()
                .nombre("objeto10")
                .build();

        prestamoUq.getListaClientes().add(cliente1);
        prestamoUq.getListaClientes().add(cliente2);
        prestamoUq.getListaClientes().add(cliente3);

        prestamoUq.getListaPrestamos().add(objeto1);
        return prestamoUq;
    }
}
