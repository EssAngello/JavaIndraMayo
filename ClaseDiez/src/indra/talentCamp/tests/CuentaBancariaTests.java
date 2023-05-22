package indra.talentCamp.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import indra.talentCamp.banco.*;

class CuentaBancariaTests {

	Cliente demoCliente;

	@BeforeAll
	public static void beforeAll(){
		System.out.println("Antes de ejecutar todos los test de esta clase");
	}

	@BeforeEach
	public void beforeEach() {
		System.out.println("Antes de ejecutar cada test de esta clase");

		demoCliente = Cliente.builder().setIdentificador(123).setNombre("Esteban").setApellido("Calabria").build();
	}

	@Test
	void ShouldAutoincrementCuentaBancariaNumero() {
		
	    Banco banco = new Banco();
		
		demoCliente = Cliente.builder().setIdentificador(123).setNombre("Demo").setApellido("Cliente").build();
	    
		//No la puedo crear directo porque el constructor es package-private
		CuentaBancaria cuentaUno = banco.crearCuentaCorriente(demoCliente);
		CuentaBancaria cuentaDos = banco.crearCajaDeAhorrro(demoCliente);
		
		assertTrue(cuentaUno.getNumeroCuenta() < cuentaDos.getNumeroCuenta(), "Las dos cuentas no son correlativas");
		assertEquals(1, cuentaUno.getNumeroCuenta());
		assertEquals(2, cuentaDos.getNumeroCuenta(), "La cuenta dos no tien numero dos");
	}

	@Test
	void ShouldExtractCorrectly() throws SaldoInsuficienteException {
		Banco banco = new Banco();

		demoCliente = Cliente.builder().setIdentificador(123).setNombre("Esteban").setApellido("Calabria").build();

		CuentaBancaria cajaAhorro = banco.crearCajaDeAhorrro(demoCliente);
		cajaAhorro.depositar(100);
		cajaAhorro.extraer(50);

		assertEquals(50, cajaAhorro.getSaldo());
	}

}
