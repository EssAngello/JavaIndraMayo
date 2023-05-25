package indra.talentCamp.dependencyInjection.reflection.tests;

import indra.talentCamp.dependencyInjection.reflection.DatabaseRepository;
import indra.talentCamp.dependencyInjection.reflection.MockRepository;
import indra.talentCamp.dependencyInjection.reflection.PartyService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PartyServiceTest {

    @BeforeEach
    public void configure(){
        PartyService.registerRepositoryClass(MockRepository.class);
    }

    @Test
    public void test(){
        //tiempo de ejecucion
        PartyService service = new PartyService();
        service.haveFun();

        assertEquals(true, true);
    }

}
