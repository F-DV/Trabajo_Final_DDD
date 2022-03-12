package co.com.sofka.trabajoFinal.cursosVirtuales.usuario.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.trabajoFinal.cursosVirtuales.usuario.values.DatosId;
import co.com.sofka.trabajoFinal.cursosVirtuales.usuario.values.Email;
import co.com.sofka.trabajoFinal.cursosVirtuales.usuario.values.Nombre;

public class DatosCreados extends DomainEvent {
    private final DatosId datosId;
    private final Nombre nombre;
    private final Email email;

    public DatosCreados(DatosId datosId,Nombre nombre, Email email) {
        super("cursosvirtuales.usuario.datoscreados");
        this.datosId = datosId;
        this.nombre = nombre;
        this.email = email;
    }
}
