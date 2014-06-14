package clientetarjeta;

public abstract class Cliente {

    String dni;
    String nombre;
    String apellido;
    String codigoUnico;
    double consumoSoles;
    Tarjeta tarjeta;

    public Cliente(String dni, String nombre, String apellido, String codigoUnico, double consumoSoles) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoUnico = codigoUnico;
        this.consumoSoles = consumoSoles;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCodigoUnico() {
        return codigoUnico;
    }

    public void setCodigoUnico(String codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    public double getConsumoSoles() {
        return consumoSoles;
    }

    public void setConsumoSoles(double consumoSoles) {
        this.consumoSoles = consumoSoles;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public abstract void calcularPuntos();

}
