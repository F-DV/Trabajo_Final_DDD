package co.com.sofka.trabajoFinal.cursosVirtuales.usuario;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.trabajoFinal.cursosVirtuales.marketPlace.values.CuentaId;
import co.com.sofka.trabajoFinal.cursosVirtuales.usuario.events.DatosCreados;
import co.com.sofka.trabajoFinal.cursosVirtuales.usuario.events.EmailDeDatosActualizado;
import co.com.sofka.trabajoFinal.cursosVirtuales.usuario.events.NombreDeDatosActualizado;
import co.com.sofka.trabajoFinal.cursosVirtuales.usuario.events.UsuarioCreado;
import co.com.sofka.trabajoFinal.cursosVirtuales.usuario.values.DatosId;
import co.com.sofka.trabajoFinal.cursosVirtuales.usuario.values.Email;
import co.com.sofka.trabajoFinal.cursosVirtuales.usuario.values.Nombre;
import co.com.sofka.trabajoFinal.cursosVirtuales.usuario.values.UsuarioId;

import java.util.Objects;

public class Usuario extends AggregateEvent<UsuarioId> {

    protected Datos datos;
    protected CuentaId cuentaId;

    /**
     * Cuando creamos el usuario llamamos el evento de dominio UsuarioCreado y le enviamos nombre y email
     */
    public Usuario(UsuarioId entityId, Datos datos) {
        super(entityId);
        appendChange(new UsuarioCreado(datos)).apply();
    }
    /**
     * Creamos Constructor privado para afectar los estados
     * tendra un subscribe que estara pendiente del eventos para
     * cambiar los estados de este agregado, este subscribe sera evenchange
     */
    private Usuario(UsuarioId usuarioId){
        super(usuarioId);
        subscribe(new UsuarioChange(this));
    }
    /**
     * Comportamientos de agregado que lanzan eventos
     */
    public void agregarDatos(DatosId datosId, Nombre nombre, Email email){
        Objects.nonNull(datosId);
        Objects.nonNull(nombre);
        Objects.nonNull(email);
        appendChange(new DatosCreados(datosId,nombre,email)).apply();
    }
    public void actualizarNombreDeDatos(DatosId datosId, Nombre nombre){
        appendChange(new NombreDeDatosActualizado(datosId,nombre)).apply();
    }
    public void actualizarEmailDeDatos(DatosId datosId, Email email){
        appendChange(new EmailDeDatosActualizado(datosId,email)).apply();
    }

    public Datos Datos() {
        return datos;
    }

    public CuentaId CuentaId() {
        return cuentaId;
    }
}
