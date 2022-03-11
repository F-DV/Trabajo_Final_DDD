package co.com.sofka.trabajoFinal.cursosVirtuales.marketPlace.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.trabajoFinal.cursosVirtuales.marketPlace.values.PagoId;

public class MetodoDePagoAñadido extends DomainEvent {
    private final PagoId pagoId;

    public MetodoDePagoAñadido(PagoId pagoId){
        super("cuenta.añadirPago");
        this.pagoId = pagoId;
    }



}
