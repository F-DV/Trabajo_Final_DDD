package co.com.sofka.trabajoFinal.cursosVirtuales.marketPlace;

import co.com.sofka.domain.generic.AggregateRoot;
import co.com.sofka.trabajoFinal.cursosVirtuales.marketPlace.values.CuentaId;
import co.com.sofka.trabajoFinal.cursosVirtuales.marketPlace.values.CursoId;
import co.com.sofka.trabajoFinal.cursosVirtuales.marketPlace.values.UsuarioId;

import java.util.List;

public class Cuenta extends AggregateRoot<CuentaId> {

    protected List<CursoId> cursos;
    protected UsuarioId usuarioId;
    protected Perfil perfil;
    protected Plan plan;
    protected Pago pago;

    public Cuenta(CuentaId entityId) {
        super(entityId);
    }

}
