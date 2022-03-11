package co.com.sofka.trabajoFinal.cursosVirtuales.marketPlace.event;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.trabajoFinal.cursosVirtuales.marketPlace.values.UsuarioId;

public class UsuarioCreado extends EventChange {
    private final UsuarioId usuarioId;

    public UsuarioCreado(UsuarioId usuarioId) {
        this.usuarioId = usuarioId;
    }
     public UsuarioId getUsuarioId(){
        return usuarioId;
     }

}
