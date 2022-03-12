package co.com.sofka.trabajoFinal.cursosVirtuales.usuario;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.trabajoFinal.cursosVirtuales.marketPlace.event.UsuarioCreado;
import co.com.sofka.trabajoFinal.cursosVirtuales.usuario.events.DatosCreados;

public class UsuarioChange extends EventChange {
    /**
     * Aqui Aplicamos los eventos de Dominio
     * con changes cambiamos los estados y con el agregado
     * lanzamos los eventos
     */
    public UsuarioChange(Usuario usuario){
        apply((DatosCreados event) ->{
            usuario.datos = event.getDatos
        });
    }
}
