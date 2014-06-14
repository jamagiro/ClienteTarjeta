
package clientetarjeta;

public class ClienteNormal extends Cliente{

    public ClienteNormal(String dni, String nombre, String apellido, String codigoUnico, double consumoSoles) {
        super(dni, nombre, apellido, codigoUnico, consumoSoles);
    }

    @Override
    public void calcularPuntos() {
        tarjeta.setPuntosAcumulados(consumoSoles*0.25 +300);
    }
    
}
