package co.com.sofka.trabajoFinal.cursosVirtuales.usuario.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.trabajoFinal.cursosVirtuales.usuario.values.DatosId;
import co.com.sofka.trabajoFinal.cursosVirtuales.usuario.values.Nombre;

import java.util.UUID;

public class NombreDeDatosActualizado extends DomainEvent {
    private final DatosId datosId;
    private final Nombre nombre;

    public NombreDeDatosActualizado(DatosId datosId,Nombre nombre) {
        super("cursosvirtuales.Usuario.nombrededatosactualizado");
        this.datosId = datosId;
        this.nombre = nombre;
    }
}
