package models;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<CuentaBancaria> cuentas;

    public Banco() {
        cuentas = new ArrayList<>();
    }

    public void agregarCuenta(CuentaBancaria cuenta) {
        cuentas.add(cuenta);
    }

    public void mostrarCuentas() {
        for (CuentaBancaria cuenta : cuentas) {
            System.out.println("Numero de cuenta: " + cuenta.getNumeroCuenta());
            System.out.println("Cliente: " + cuenta.getCliente().getNombre());
            System.out.println("Saldo disponible: " + cuenta.getSaldo());
            System.out.println("Movimientos: ");
            for (Movimiento movimiento : cuenta.getMovimientos()) {
                System.out.println(movimiento);
            }
            System.out.println("------------------------");
        }
    }

}
