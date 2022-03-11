package co.com.sofka.trabajoFinal.cursosVirtuales.marketPlace.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Date;

public class FechaCaducidad implements ValueObject<Date> {

    private final Date fechaCaducidad;

    public FechaCaducidad(Date fechaCaducidad) {
        //todo validar fecha de caducidad
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public Date value() {
        return fechaCaducidad;
    }
}
