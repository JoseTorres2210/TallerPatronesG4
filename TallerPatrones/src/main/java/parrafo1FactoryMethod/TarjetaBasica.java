package parrafo1FactoryMethod;

public class TarjetaBasica extends TarjetaCredito {

    private double costoAnual;
    private double limiteCredito;

    public TarjetaBasica() {
    }

    @Override
    public Tarjeta crearTarjeta() {
        TarjetaBasica tarjetaBasica = new TarjetaBasica();
        return tarjetaBasica;
    }

    public void defCostoAnual() {
        this.costoAnual = 50;
    }

    public void defLimCred() {
        this.limiteCredito = 1000;
    }

}
