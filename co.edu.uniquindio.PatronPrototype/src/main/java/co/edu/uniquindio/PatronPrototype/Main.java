package co.edu.uniquindio.PatronPrototype;

import co.edu.uniquindio.PatronPrototype.model.Persona;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //CREAR EL OBJETO ORIGINAL
        Persona personaOriginal = new Persona("JULIAN",24);
        System.out.println("PERSONA ORIGINAL: " + personaOriginal);

        //CLONAR EL OBJETO UTILIZANDO EL PATRON PROTOTYPE
        Persona personaClonada = (Persona) personaOriginal.clonarObjeto();
        System.out.println("PERSONA CLONADA: " + personaClonada);

        //COMPROBAR QUE EL ORIGINAL SIGUE INTACTO
        System.out.println("PERSONA ORIGINAL VERIFICANDO: " + personaOriginal);
    }
}