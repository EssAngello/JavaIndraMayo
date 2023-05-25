package indra.talentCamp.dependencyInjection.constructor.tests;

import indra.talentCamp.dependencyInjection.constructor.MockRepository;
import indra.talentCamp.dependencyInjection.constructor.PartyService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PartyServiceTest {

    @Test
    public void test(){
        //tiempo de configuracion
        PartyService service = new PartyService(new MockRepository());

        //tiempo de ejecución
        service.haveFun();

        assertEquals(true, true);
    }

}
