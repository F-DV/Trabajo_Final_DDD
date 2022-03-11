package co.com.sofka.trabajoFinal.cursosVirtuales.marketPlace.values;

import co.com.sofka.domain.generic.Identity;

public class PerfilId extends Identity {

    private PerfilId(String valor){
        super(valor);
    }
    public PerfilId(){}

    public static PerfilId of(String valor){
        return new PerfilId(valor);
    }
}
