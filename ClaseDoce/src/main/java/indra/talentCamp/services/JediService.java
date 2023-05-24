package indra.talentCamp.services;

import indra.talentCamp.models.Jedi;
import indra.talentCamp.persistence.JediFileRepository;
import indra.talentCamp.persistence.JediMockRepository;
import indra.talentCamp.persistence.SaveErrorException;
import indra.talentCamp.persistence.interfaces.Repository;

import java.awt.*;
import java.util.Random;

public class JediService {

    private Repository<Jedi> repository;

    public JediService(Repository<Jedi> repo){
        /*this.repository = new JediMockRepository();*/
        /*this.repository = new JediFileRepository();*/
        this.repository = repo;
    }

    private int calcularNivelFuerza(Jedi j) {
        return new Random().nextInt(1000, 10000);
    }

    private Color crearSableNuevo(){
        return Color.GREEN;
    }

    public void alistar(String nombre) throws SaveErrorException {
        Jedi nuevo = new Jedi(nombre, this.crearSableNuevo());
        nuevo.setNivelDeFuerza(this.calcularNivelFuerza(nuevo));
        this.repository.save(nuevo);

    }


}
