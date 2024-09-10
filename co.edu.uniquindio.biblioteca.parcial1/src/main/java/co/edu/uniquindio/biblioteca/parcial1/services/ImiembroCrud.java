package co.edu.uniquindio.biblioteca.parcial1.services;

import co.edu.uniquindio.biblioteca.parcial1.model.Miembro;
import java.util.List;

public interface ImiembroCrud {

    boolean crearMiembro(String nombre, int id, int edad );
    boolean eliminarMiembro(int id);
    boolean actualizarMiembro(int id, String nombreNuevo, int idNuevo, int edadNueva);
    List<Miembro> leerMiembros(List<Miembro>ListaMiembros);
}
