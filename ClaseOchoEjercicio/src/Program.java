import models.Banco;
import models.Cliente;
import models.CuentaAhorro;
import models.CuentaCorriente;

public class Program {

    public static void main(String[] args) {
        Banco banco = new Banco();

        // Crear clientes
        Cliente cliente1 = new Cliente("Juan", "12345678");
        Cliente cliente2 = new Cliente("Maria", "98765432");

        // Crear cuentas bancarias
        CuentaAhorro cuentaAhorro1 = new CuentaAhorro("001", cliente1);
        CuentaAhorro cuentaAhorro2 = new CuentaAhorro("002", cliente2);

        CuentaCorriente cuentaCorriente1 = new CuentaCorriente("003", cliente1, 1000);
        CuentaCorriente cuentaCorriente2 = new CuentaCorriente("004", cliente2, 2000);

        // Agregar cuentas al banco
        banco.agregarCuenta(cuentaAhorro1);
        banco.agregarCuenta(cuentaAhorro2);
        banco.agregarCuenta(cuentaCorriente1);
        banco.agregarCuenta(cuentaCorriente2);

        // Realizar transacciones
        cuentaAhorro1.depositar(500);
        cuentaAhorro2.depositar(1000);

        cuentaCorriente1.depositar(200);
        cuentaCorriente1.extraer(150);

        cuentaCorriente2.depositar(1000);
        cuentaCorriente2.extraer(2000);

        // Mostrar información de las cuentas
        banco.mostrarCuentas();
    }

}
