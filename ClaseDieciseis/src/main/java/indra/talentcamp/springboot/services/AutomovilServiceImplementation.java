package indra.talentcamp.springboot.services;

import indra.talentcamp.springboot.models.Automovil;
import indra.talentcamp.springboot.repositories.AutomovilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutomovilServiceImplementation implements AutomovilService{

    @Autowired
    AutomovilRepository repository;

    @Override
    public Automovil autoDeElonMusk() {
        return this.repository.findById(55);
    }

}
