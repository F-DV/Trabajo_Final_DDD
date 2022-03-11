package co.com.sofka.trabajoFinal.cursosVirtuales.marketPlace.values;
import co.com.sofka.domain.generic.ValueObject;

public class Contacto implements ValueObject<Contacto.Props> {
    private final long numeroCel;
    private final String cuentaFacebook;
    private final String cuentaInstagram;

    public Contacto(long numeroCel, String cuentaFacebook, String cuentaInstagram) {
        //todo: Crear validaciones
        this.numeroCel = numeroCel;
        this.cuentaFacebook = cuentaFacebook;
        this.cuentaInstagram = cuentaInstagram;
    }

    @Override
    public Contacto.Props value() {
        return new Props() {
            @Override
            public long numeroCel() {
                return numeroCel;
            }

            @Override
            public String cuentaFacebook() {
                return cuentaFacebook;
            }

            @Override
            public String cuentaInstagram() {
                return cuentaInstagram;
            }
        };
    }

    public interface Props{
        long numeroCel();
        String cuentaFacebook();
        String cuentaInstagram();
    }
}
