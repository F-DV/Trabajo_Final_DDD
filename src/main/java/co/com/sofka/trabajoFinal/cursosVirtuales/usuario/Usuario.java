package co.com.sofka.trabajoFinal.cursosVirtuales.usuario;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.trabajoFinal.cursosVirtuales.marketPlace.values.CuentaId;
import co.com.sofka.trabajoFinal.cursosVirtuales.usuario.events.UsuarioCreado;
import co.com.sofka.trabajoFinal.cursosVirtuales.usuario.values.Email;
import co.com.sofka.trabajoFinal.cursosVirtuales.usuario.values.Nombre;
import co.com.sofka.trabajoFinal.cursosVirtuales.usuario.values.UsuarioId;

public class Usuario extends AggregateEvent<UsuarioId> {

    protected Nombre nombre;
    protected Email email;
    protected CuentaId cuentaId;

    /**
     * Cuando creamos el usuario llamamos el evento de dominio UsuarioCreado y le enviamos nombre y email
     */
    public Usuario(UsuarioId entityId, Nombre nombre,Email email) {
        super(entityId);
        appendChange(new UsuarioCreado(nombre,email)).apply();
    }
}
