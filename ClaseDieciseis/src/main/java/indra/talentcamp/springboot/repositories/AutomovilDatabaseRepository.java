package indra.talentcamp.springboot.repositories;

import indra.talentcamp.springboot.models.Automovil;
import org.springframework.stereotype.Repository;

@Repository
public class AutomovilDatabaseRepository implements AutomovilRepository{

    @Override
    public Automovil findById(int id) {
        return new Automovil(){
            {
                setId(id);
                setMarca("Tesla");
                setMatricula("4367MD");
                setElectrico(true);
            }
        };
    }
}
