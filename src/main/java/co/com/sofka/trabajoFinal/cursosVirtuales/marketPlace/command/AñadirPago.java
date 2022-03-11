package co.com.sofka.trabajoFinal.cursosVirtuales.marketPlace.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.trabajoFinal.cursosVirtuales.marketPlace.values.Metodo;
import co.com.sofka.trabajoFinal.cursosVirtuales.marketPlace.values.PagoId;

public class AñadirPago extends Command {
    private final PagoId pagoId;

    public AñadirPago(PagoId pagoId) {
        this.pagoId = pagoId;
    }

    public PagoId getPagoId(){
        return pagoId;
    }
}
