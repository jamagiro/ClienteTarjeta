
package clientetarjeta;

public class ClientePlatinium extends Cliente {

    public ClientePlatinium(String dni, String nombre, String apellido, String codigoUnico, double consumoSoles) {
        super(dni, nombre, apellido, codigoUnico, consumoSoles);
    }

    @Override
    public void calcularPuntos() {
        tarjeta.setPuntosAcumulados(consumoSoles*(consumoSoles*0.1)+ 250 * (consumoSoles*0.75));
    }

}
