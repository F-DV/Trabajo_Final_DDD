package co.com.sofka.trabajoFinal.cursosVirtuales.marketPlace;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.AggregateRoot;
import co.com.sofka.trabajoFinal.cursosVirtuales.marketPlace.values.CuentaId;
import co.com.sofka.trabajoFinal.cursosVirtuales.marketPlace.values.CursoId;
import co.com.sofka.trabajoFinal.cursosVirtuales.marketPlace.values.UsuarioId;

import java.util.List;

public class Cuenta extends AggregateEvent<CuentaId> {

    protected List<CursoId> cursos;
    protected UsuarioId usuarioId;
    protected Perfil perfil;
    protected Plan plan;


    public Cuenta(CuentaId entityId) {
        super(entityId);
    }

}
