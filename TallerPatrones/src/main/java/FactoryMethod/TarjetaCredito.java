package FactoryMethod;

public abstract class TarjetaCredito implements Tarjeta {

    private double costoAnual;
    private double limiteCredito;

    public abstract Tarjeta crearTarjeta();

}
