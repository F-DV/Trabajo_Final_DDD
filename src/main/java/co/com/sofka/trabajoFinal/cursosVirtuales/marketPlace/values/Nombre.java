package co.com.sofka.trabajoFinal.cursosVirtuales.marketPlace.values;

import co.com.sofka.domain.generic.ValueObject;

public class Nombre implements ValueObject<Nombre.Props> {

    private final String nombres;
    private final String apellidos;

    public Nombre(String nombres, String apellidos) {
        //todo: crear validaciones
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    @Override
    public Props value() {
        return new Props(){
            @Override
            public String nombres() {
                return nombres;
            }

            @Override
            public String apellidos() {
                return apellidos;
            }
        };
    }

    public interface Props{
        String nombres();
        String apellidos();
    }
}


