package indra.talentCamp.tests;

import indra.talentCamp.banco.Cliente;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ClienteTests {

    @Test
    public void shouldValidateClienteCreation(){
        assertThrows(AssertionError.class, ()->Cliente.builder().setNombre("mal").build());
        assertThrows(AssertionError.class, ()->Cliente.builder().setApellido("mal").build());
        assertThrows(AssertionError.class, ()->Cliente.builder().setIdentificador(1).build());
        assertThrows(AssertionError.class, ()->Cliente.builder().setNombre("mal").setApellido("mal").build());
    }

}
