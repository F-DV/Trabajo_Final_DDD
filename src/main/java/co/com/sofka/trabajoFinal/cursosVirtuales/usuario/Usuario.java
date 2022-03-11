package co.com.sofka.trabajoFinal.cursosVirtuales.usuario;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.trabajoFinal.cursosVirtuales.usuario.value.UsuarioId;

public class Usuario extends AggregateEvent<UsuarioId> {

    public Usuario(UsuarioId entityId) {
        super(entityId);
    }
}
