package models;

public abstract class Movimiento {

    private double cantidad;

    public Movimiento(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "    Movimiento: " + getClass().getSimpleName() + ", Cantidad: " + cantidad;
    }

}
