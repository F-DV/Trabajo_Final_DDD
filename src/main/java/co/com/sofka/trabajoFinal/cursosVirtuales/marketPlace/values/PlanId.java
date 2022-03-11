package co.com.sofka.trabajoFinal.cursosVirtuales.marketPlace.values;

import co.com.sofka.domain.generic.Identity;

public class PlanId extends Identity{

    private PlanId(String valor){
        super(valor);
    }
    public PlanId(){}

    public static PlanId of(String valor){
        return new PlanId(valor);
    }
}
