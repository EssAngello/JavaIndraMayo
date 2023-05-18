package models;

import java.util.ArrayList;
import java.util.List;

public abstract class CuentaBancaria {

    private String numeroCuenta;
    private double saldo;
    private Cliente cliente;
    private List<Movimiento> movimientos;

    public CuentaBancaria(String numeroCuenta, Cliente cliente) {
        this.numeroCuenta = numeroCuenta;
        this.cliente = cliente;
        saldo = 0;
        movimientos = new ArrayList<>();
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Movimiento> getMovimientos() {
        return movimientos;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
        Movimiento movimiento = new Deposito(cantidad);
        movimientos.add(movimiento);
    }

    public abstract void extraer(double cantidad);

}
