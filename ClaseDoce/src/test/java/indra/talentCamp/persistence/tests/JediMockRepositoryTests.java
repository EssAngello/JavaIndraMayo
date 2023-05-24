package indra.talentCamp.persistence.tests;


import indra.talentCamp.models.Jedi;
import indra.talentCamp.persistence.JediMockRepository;
import indra.talentCamp.persistence.NotFoundException;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class JediMockRepositoryTests {

    @Test
    void shouldThrowAnExceptionIfNotFound() {
        JediMockRepository repo = new JediMockRepository();
        assertThrows(NotFoundException.class, ()->repo.findById(28));
    }

    @Test
    void shouldSaveAndThenFind() throws NotFoundException {
        JediMockRepository repo = new JediMockRepository();

        Jedi yoda = new Jedi("yoda", 10000, Color.GREEN);

        repo.save(yoda);

        Jedi yodaRenacido = (Jedi) repo.findById(1);

        assertEquals(yoda.getNombre(), yodaRenacido.getNombre());
    }

}
