package indra.talentcamp.springboot.repositories;

import indra.talentcamp.springboot.models.Automovil;


public interface AutomovilRepository {

    public Automovil findById(int id);

}
