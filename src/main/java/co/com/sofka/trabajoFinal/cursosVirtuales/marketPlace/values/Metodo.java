package co.com.sofka.trabajoFinal.cursosVirtuales.marketPlace.values;

import co.com.sofka.domain.generic.ValueObject;

public class Metodo implements ValueObject<Metodo.Props> {
    private final long efectivo;
    private final long tarjetaDeCredito;

    public Metodo(long efectivo, long tarjetaDeCredito) {
        //todo : Crear validaciones del metodo de pago
        this.efectivo = efectivo;
        this.tarjetaDeCredito = tarjetaDeCredito;
    }

    @Override
    public Metodo.Props value() {
        return new Props() {
            @Override
            public long efectivo() {
                return efectivo;
            }

            @Override
            public long tarjetaDeCredito() {
                return tarjetaDeCredito;
            }
        };
    }

    public interface Props{
        long efectivo();
        long tarjetaDeCredito();
    }
}
