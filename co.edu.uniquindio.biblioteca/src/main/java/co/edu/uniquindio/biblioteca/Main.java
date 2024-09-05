package co.edu.uniquindio.biblioteca;

import co.edu.uniquindio.biblioteca.model.Biblioteca;
import co.edu.uniquindio.biblioteca.model.Libro;
import co.edu.uniquindio.biblioteca.model.Miembro;
import co.edu.uniquindio.biblioteca.model.Prestamo;

import java.time.LocalDate;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = inicializarDatos();
        biblioteca.mostrarDisponiblidadLibro();
        biblioteca.mostarMiembrosMayores();

    }

    private static Biblioteca inicializarDatos() {
        Biblioteca biblioteca = new Biblioteca();
        Libro libro1 = new Libro();
        libro1.setTitulo("CIEN AÑOS DE SOLEDAD");
        libro1.setAutor("Gabriel García Márquez");
        libro1.setIsbn("978-958-42-7450-2");
        libro1.setPrestado(true);
        Libro libro2 = new Libro();
        libro2.setTitulo("El olvido que seremos");
        libro2.setAutor("Héctor Abad Faciolince");
        libro2.setIsbn(" 978-958-5457-60-6");
        libro2.setPrestado(false);
        Libro libro3 = new Libro();
        libro3.setTitulo("Delirio");
        libro3.setAutor("Laura Restrepo");
        libro3.setIsbn("978-958-704-267-1");
        libro3.setPrestado(false);
        Libro libro4 = new Libro();
        libro4.setTitulo("La vorágine");
        libro4.setAutor("José Eustasio Rivera");
        libro4.setIsbn("978-958-38-0215-3");
        libro4.setPrestado(true);
        Libro libro5 = new Libro();
        libro5.setTitulo("Rosario Tijeras");
        libro5.setAutor("Jorge Franco");
        libro5.setIsbn("978-958-704-993-9");
        libro5.setPrestado(true);

        biblioteca.getListaLibros().add(libro1);
        biblioteca.getListaLibros().add(libro2);
        biblioteca.getListaLibros().add(libro3);
        biblioteca.getListaLibros().add(libro4);
        biblioteca.getListaLibros().add(libro5);

        Miembro miembro1 = new Miembro();
        miembro1.setNombre("julian");
        miembro1.setId(1000192445);
        miembro1.setEdad(25);
        Miembro miembro2 = new Miembro();
        miembro2.setNombre("andy");
        miembro2.setId(1235445);
        miembro2.setEdad(25);
        Miembro miembro3 = new Miembro();
        miembro3.setNombre("camilo");
        miembro3.setId(867537909);
        miembro3.setEdad(35);
        Miembro miembro4 = new Miembro();
        miembro4.setNombre("juliana");
        miembro4.setId(123);
        miembro4.setEdad(42);
        Miembro miembro5 = new Miembro();
        miembro5.setNombre("camila");
        miembro5.setId(30975325);
        miembro5.setEdad(50);

        biblioteca.getListaMiembros().add(miembro1);
        biblioteca.getListaMiembros().add(miembro2);
        biblioteca.getListaMiembros().add(miembro3);
        biblioteca.getListaMiembros().add(miembro4);
        biblioteca.getListaMiembros().add(miembro5);

        Prestamo prestamo1 = new Prestamo();
        prestamo1.setLibro(libro1);
        prestamo1.setMiembro(miembro1);
        prestamo1.setInicioPrestamo(LocalDate.EPOCH);
        prestamo1.setFinPrestamo(LocalDate.now());

        Prestamo prestamo2 = new Prestamo();
        prestamo2.setLibro(libro2);
        prestamo2.setMiembro(miembro2);
        prestamo2.setInicioPrestamo(LocalDate.now());
        prestamo2.setFinPrestamo(LocalDate.now());

        Prestamo prestamo3 = new Prestamo();
        prestamo3.setLibro(libro3);
        prestamo3.setMiembro(miembro3);
        prestamo3.setInicioPrestamo(LocalDate.now());
        prestamo3.setFinPrestamo(LocalDate.now());

        biblioteca.getListaPrestamos().add(prestamo1);
        biblioteca.getListaPrestamos().add(prestamo2);
        biblioteca.getListaPrestamos().add(prestamo3);



        return biblioteca;
    }


}