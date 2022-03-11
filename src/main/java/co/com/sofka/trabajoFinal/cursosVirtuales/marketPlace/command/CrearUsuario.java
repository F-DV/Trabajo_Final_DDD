package co.com.sofka.trabajoFinal.cursosVirtuales.marketPlace.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.trabajoFinal.cursosVirtuales.marketPlace.values.UsuarioId;

public class CrearUsuario extends Command {
    private final UsuarioId usuarioId;

    public CrearUsuario(UsuarioId usuarioId) {
        this.usuarioId = usuarioId;
    }

    public UsuarioId getUsuarioId(){
        return usuarioId;
    }
}
