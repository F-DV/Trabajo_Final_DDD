package co.com.sofka.trabajoFinal.cursosVirtuales.usuario.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.trabajoFinal.cursosVirtuales.usuario.Datos;
import co.com.sofka.trabajoFinal.cursosVirtuales.usuario.values.Email;
import co.com.sofka.trabajoFinal.cursosVirtuales.usuario.values.Nombre;

public class UsuarioCreado extends DomainEvent {
    private final Datos datos;

    public UsuarioCreado(Datos datos) {
        super("cursosvirtuales.usuario.usuariocreado");
        this.datos = datos;
    }

    public Datos getDatos() {
        return datos;
    }

}
