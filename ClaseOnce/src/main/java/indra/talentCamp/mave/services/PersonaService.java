package indra.talentCamp.mave.services;

import indra.talentCamp.mave.models.Persona;
import indra.talentCamp.mave.persistence.PersonaRepository;

import java.util.List;

public class PersonaService {

    private PersonaRepository repository;

    public PersonaService() {
        this.repository = new PersonaRepository();
    }

    public List<Persona> recuperarPersonas() {
        List<Persona> personas = this.repository.findAll();
        return personas;
    }

    public void registrarPersonaNueva(Persona persona) {
        if(persona.getNombre()==null) {

        }

        this.repository.save(persona);
    }





}
