package FactoryMethod;

public class TarjetaPremium extends TarjetaCredito {

    private double costoAnual;
    private double limiteCredito;

    public TarjetaPremium() {
    }

    @Override
    public Tarjeta crearTarjeta() {
        TarjetaPremium tarjetaPremium = new TarjetaPremium();
        return tarjetaPremium;
    }

    public void defCostoAnual() {
        this.costoAnual = 100;
    }

    public void defLimCred() {
        this.limiteCredito = 5000;
    }

}
