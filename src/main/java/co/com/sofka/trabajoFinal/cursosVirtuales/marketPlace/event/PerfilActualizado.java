package co.com.sofka.trabajoFinal.cursosVirtuales.marketPlace.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.trabajoFinal.cursosVirtuales.marketPlace.values.PerfilId;

public class PerfilActualizado extends DomainEvent {
    private final PerfilId perfilId;

    public PerfilActualizado(PerfilId perfilId){
        super("cuenta.añadirPago");
        this.perfilId = perfilId;
    }

}
