package co.com.sofka.trabajoFinal.cursosVirtuales.marketPlace.values;

import co.com.sofka.domain.generic.Identity;

public class PagoId extends Identity {

    private PagoId(String valor){
        super(valor);
    }
    public PagoId(){}

    public static PagoId of(String valor){
        return new PagoId(valor);
    }
}
