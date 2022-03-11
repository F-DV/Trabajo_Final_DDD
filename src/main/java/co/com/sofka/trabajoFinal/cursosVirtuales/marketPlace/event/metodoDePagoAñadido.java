package co.com.sofka.trabajoFinal.cursosVirtuales.marketPlace.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.trabajoFinal.cursosVirtuales.marketPlace.Pago;
import co.com.sofka.trabajoFinal.cursosVirtuales.marketPlace.values.PagoId;

public class metodoDePagoAñadido extends DomainEvent {
    private final PagoId pagoId;

    public metodoDePagoAñadido(PagoId pagoId){
        super("cuenta.añadirPago");
        this.pagoId = pagoId;
    }



}
