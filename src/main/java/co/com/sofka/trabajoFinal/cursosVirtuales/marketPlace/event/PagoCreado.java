package co.com.sofka.trabajoFinal.cursosVirtuales.marketPlace.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.trabajoFinal.cursosVirtuales.marketPlace.values.PagoId;

public class PagoCreado extends DomainEvent {
    private final PagoId pagoId;

    public PagoCreado(PagoId pagoId){
        super("pago.pagocreado");
        this.pagoId = pagoId;
    }

    public PagoId getPagoId(){
        return pagoId;
    }
}
