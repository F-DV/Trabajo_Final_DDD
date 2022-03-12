package co.com.sofka.trabajoFinal.cursosVirtuales.usuario.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.trabajoFinal.cursosVirtuales.usuario.values.Email;
import co.com.sofka.trabajoFinal.cursosVirtuales.usuario.values.Nombre;

public class UsuarioCreado extends DomainEvent {
    private final Nombre nombre;
    private final Email email;

    public UsuarioCreado(Nombre nombre, Email email) {
        super("cursosvirtuales.usuario.usuariocreado");
        this.nombre = nombre;
        this.email = email;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Email getEmail() {
        return email;
    }
}
