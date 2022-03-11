package co.com.sofka.trabajoFinal.cursosVirtuales.marketPlace.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.trabajoFinal.cursosVirtuales.marketPlace.Plan;

public class ActualizarPlan extends Command {
    private final Plan plan;

    public ActualizarPlan(Plan plan) {
        this.plan = plan;
    }
}
