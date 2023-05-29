package indra.talentCamp.database.services;

import indra.talentCamp.database.models.Persona;
import indra.talentCamp.database.persistence.PersonaRepository;

import java.util.List;

public class PersonaService {

    private PersonaRepository repository;

    public List<Persona> cracksDeJava(){
        return this.repository.findAll();
    }

    public void setRepository(PersonaRepository repository) {
        this.repository = repository;
    }

    public PersonaRepository getRepository() {
        return repository;
    }
}
