package co.com.sofka.trabajoFinal.cursosVirtuales.marketPlace.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.trabajoFinal.cursosVirtuales.marketPlace.values.Metodo;

public class AñadirMetodoDePago extends Command {
    private final Metodo metodo;


    public AñadirMetodoDePago(Metodo metodo) {
        this.metodo = metodo;
    }
}
