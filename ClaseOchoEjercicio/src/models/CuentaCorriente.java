package models;

public class CuentaCorriente extends CuentaBancaria {

    private double limiteDescubierto;

    public CuentaCorriente(String numeroCuenta, Cliente cliente, double limiteDescubierto) {
        super(numeroCuenta, cliente);
        this.limiteDescubierto = limiteDescubierto;
    }

    @Override
    public void extraer(double cantidad) {
        if(this.getSaldo() - cantidad < 0 - this.limiteDescubierto){
            System.out.println("No se puede extraer mas dinero de la cuenta corriente "+this.getNumeroCuenta()+", excede el limite de descubierto");
        }else{
            this.setSaldo(this.getSaldo() - cantidad);
            Movimiento movimiento = new Extraccion(cantidad);
            this.getMovimientos().add(movimiento);
        }
    }
}
