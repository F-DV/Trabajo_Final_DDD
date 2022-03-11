package co.com.sofka.trabajoFinal.cursosVirtuales.marketPlace.values;

import java.util.Objects;
import java.util.regex.*;
import co.com.sofka.domain.generic.ValueObject;

public class Email implements ValueObject<Email.Props> {

    private final String email;

    public Email(String email) {
        this.email = Objects.requireNonNull(email);
        if(!email.matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")){
            throw new IllegalArgumentException("El email contiene valores invalidos")
        }
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
