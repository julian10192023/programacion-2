package co.edu.uniquindio.PatronPrototype.services;

import co.edu.uniquindio.PatronPrototype.model.Persona;

public interface IclonarPrototipo extends Cloneable{
    public Persona clonarObjeto();
}
