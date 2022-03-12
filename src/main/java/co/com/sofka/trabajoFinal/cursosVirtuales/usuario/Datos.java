package co.com.sofka.trabajoFinal.cursosVirtuales.usuario;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.trabajoFinal.cursosVirtuales.usuario.values.DatosId;
import co.com.sofka.trabajoFinal.cursosVirtuales.usuario.values.Email;
import co.com.sofka.trabajoFinal.cursosVirtuales.usuario.values.Nombre;

import java.util.Objects;

public class Datos extends Entity<DatosId> {

    private Nombre nombre;
    private Email email;

    public Datos(DatosId entityId, Nombre nombre, Email email1) {
        super(entityId);
        this.nombre = nombre;
        this.email = email1;
    }

    /**
     * Comportamientos
     */
    public void actualizarNombre(Nombre nombre){
        this.nombre = Objects.requireNonNull(nombre);
    }
    public void actualizarEmail(Email email){
        this.email = Objects.requireNonNull(email);
    }

    /**
     * Getters
     */
    public Nombre Nombre() {
        return nombre;
    }

    public Email Email() {
        return email;
    }
}
