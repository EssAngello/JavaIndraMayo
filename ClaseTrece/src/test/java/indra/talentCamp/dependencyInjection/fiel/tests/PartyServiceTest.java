package indra.talentCamp.dependencyInjection.fiel.tests;

import indra.talentCamp.dependencyInjection.field.MockRepository;
import indra.talentCamp.dependencyInjection.field.PartyService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PartyServiceTest {

    PartyService service;

    @BeforeEach
    public void Configure(){
        service = new PartyService();
    }

    @Test
    public void test(){
        PartyService service = new PartyService();

        service.setRepository(new MockRepository());

        service.haveFun();

        assertEquals(true, true);
    }

}
