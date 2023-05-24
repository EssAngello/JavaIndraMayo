import com.google.gson.Gson;
import indra.talentCamp.mave.models.Persona;
import org.junit.jupiter.api.Test;

import java.util.Properties;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GsonTests {

    private String json = "{\"nombre\": \"pepe\" , \"edad\": \"23\"}";
    private Gson gson = new Gson();

    @Test
    public void shouldReadPropertiesFromJson(){
        Properties p = gson.fromJson(json, Properties.class);
        assertEquals("pepe", p.getProperty("nombre"));
        assertEquals("23", p.getProperty("edad"));
    }

    @Test
    public void shouldReadCustomObjectFromJson(){
        Persona persona = gson.fromJson(json, Persona.class);
        assertEquals("pepe", persona.getNombre());
        assertEquals(23, persona.getEdad());
    }

}
