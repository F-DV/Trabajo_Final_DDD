package co.com.sofka.trabajoFinal.cursosVirtuales.marketPlace.values;

import co.com.sofka.domain.generic.ValueObject;

public class TipoPlan implements ValueObject<TipoPlan.Tipo> {
    private final Tipo value;

    public TipoPlan(Tipo value) {
        this.value = value;
    }

    @Override
    public Tipo value() {
        return value;
    }

    public enum Tipo{
        ANUAL, SEMESTRE,TRIMESTRAL,MENSUAL,PORCURSO
    }
}
