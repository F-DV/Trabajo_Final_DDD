package co.com.sofka.trabajoFinal.cursosVirtuales.marketPlace.values;

import co.com.sofka.domain.generic.ValueObject;

public class Email implements ValueObject<Email.Props> {

    private final String email;

    public Email(String email) {
        //todo: Crear validaciones de email
        this.email = email;
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public String email() {
                return email;
            }
        };
    }

    public interface Props{
        String email();
    }
}
