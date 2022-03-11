package co.com.sofka.trabajoFinal.cursosVirtuales.marketPlace.values;
import co.com.sofka.domain.generic.ValueObject;

public class Contacto implements ValueObject<Contacto.Props> {
    private final long numeroCel;
    private final String cuentaFacebook;
    private final String cuentaInstagram;

    public Contacto(long numeroCel, String cuentaFacebook, String cuentaInstagram) {

        this.numeroCel = Objects.requireNonNull(numeroCel);
        this.cuentaFacebook = Objects.requireNonNull(cuentaFacebook);
        this.cuentaInstagram = Objects.requireNonNull(cuentaInstagram);
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
