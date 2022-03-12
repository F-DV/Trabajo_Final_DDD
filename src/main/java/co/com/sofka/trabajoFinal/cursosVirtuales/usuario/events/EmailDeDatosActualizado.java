package co.com.sofka.trabajoFinal.cursosVirtuales.usuario.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.trabajoFinal.cursosVirtuales.usuario.values.DatosId;
import co.com.sofka.trabajoFinal.cursosVirtuales.usuario.values.Email;

public class EmailDeDatosActualizado extends DomainEvent {
    private final DatosId datosId;
    private final Email email;

    public EmailDeDatosActualizado(DatosId datosId,Email email) {
        super("cursosvirtuales.Usuario.emaildedatosactualizado");
        this.datosId = datosId;
        this.email = email;
    }
}
