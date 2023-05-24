package indra.talentCamp.mave.controllers;

import indra.talentCamp.mave.models.Persona;
import indra.talentCamp.mave.services.PersonaService;

import java.util.List;

public class PersonaController {

    private PersonaService service;

    public PersonaController() {
        this.service = new PersonaService();
    }

    public String mostrarTodas() {
        List<Persona> personas = this.service.recuperarPersonas();
        StringBuilder builder = new StringBuilder();
        builder.append("<table>");
        builder.append("</table>");
        return builder.toString();
    }

}
