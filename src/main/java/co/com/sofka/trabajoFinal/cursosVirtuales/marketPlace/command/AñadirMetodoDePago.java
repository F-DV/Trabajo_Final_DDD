package co.com.sofka.trabajoFinal.cursosVirtuales.marketPlace.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.trabajoFinal.cursosVirtuales.marketPlace.values.Metodo;

public class A├▒adirMetodoDePago extends Command {
    private final Metodo metodo;


    public A├▒adirMetodoDePago(Metodo metodo) {
        this.metodo = metodo;
    }
}
