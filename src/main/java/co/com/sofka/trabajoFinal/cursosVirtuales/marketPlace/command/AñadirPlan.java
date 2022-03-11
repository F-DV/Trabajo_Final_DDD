package co.com.sofka.trabajoFinal.cursosVirtuales.marketPlace.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.trabajoFinal.cursosVirtuales.marketPlace.values.TipoPlan;

public class AñadirPlan extends Command {
    private final TipoPlan tipoPlan;

    public AñadirPlan(TipoPlan tipoPlan) {
        this.tipoPlan = tipoPlan;
    }
}
