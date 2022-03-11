package co.com.sofka.trabajoFinal.cursosVirtuales.marketPlace.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.trabajoFinal.cursosVirtuales.marketPlace.values.PagoId;
import co.com.sofka.trabajoFinal.cursosVirtuales.marketPlace.values.PlanId;

public class PlanAñadido extends DomainEvent {
    private final PlanId planId;

    public PlanAñadido(PlanId planId){
        super("cuenta.añadir plan");
        this.planId = planId;
    }

}
