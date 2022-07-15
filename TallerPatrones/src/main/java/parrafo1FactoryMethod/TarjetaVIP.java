package parrafo1FactoryMethod;

public class TarjetaVIP extends TarjetaCredito {

    private double costoAnual;
    private double limiteCredito;

    public TarjetaVIP() {
    }

    @Override
    public Tarjeta crearTarjeta() {
        TarjetaVIP tarjetaVIP = new TarjetaVIP();
        return tarjetaVIP;
    }

    public void defCostoAnual() {
        this.costoAnual = 150;
    }

    public void defLimCred() {
        this.limiteCredito = 10000;
    }

}
