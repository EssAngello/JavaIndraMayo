package models;

public class CuentaAhorro extends CuentaBancaria {


    public CuentaAhorro(String numeroCuenta, Cliente cliente) {
        super(numeroCuenta, cliente);
    }

    @Override
    public void extraer(double cantidad) {
        if(this.getSaldo() - cantidad < 0){
            System.out.println("No se puede extraer mas dinero de la cuenta Ahorro " + this.getNumeroCuenta());
        }else{
            this.setSaldo(this.getSaldo() - cantidad);
            Movimiento movimiento = new Extraccion(cantidad);
            this.getMovimientos().add(movimiento);
        }
    }
}
