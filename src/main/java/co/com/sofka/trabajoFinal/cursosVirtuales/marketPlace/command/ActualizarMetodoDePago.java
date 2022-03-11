package co.com.sofka.trabajoFinal.cursosVirtuales.marketPlace.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.trabajoFinal.cursosVirtuales.marketPlace.Pago;
import co.com.sofka.trabajoFinal.cursosVirtuales.marketPlace.values.Metodo;

public class ActualizarMetodoDePago extends Command {
    private final Metodo metodo;
    private final Pago pago;

    public ActualizarMetodoDePago(Metodo metodo, Pago pago) {
        this.metodo = metodo;
        this.pago = pago;
    }
}
