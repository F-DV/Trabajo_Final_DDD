package co.com.sofka.trabajoFinal.cursosVirtuales.marketPlace;

import co.com.sofka.domain.generic.AggregateRoot;
import co.com.sofka.trabajoFinal.cursosVirtuales.marketPlace.values.CuentaId;

public class Cuenta extends AggregateRoot<CuentaId> {

    public Cuenta(CuentaId entityId) {
        super(entityId);
    }
}
