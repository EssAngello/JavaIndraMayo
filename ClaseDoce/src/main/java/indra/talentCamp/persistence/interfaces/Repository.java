package indra.talentCamp.persistence.interfaces;

import indra.talentCamp.persistence.NotFoundException;
import indra.talentCamp.persistence.SaveErrorException;

import java.util.List;

public interface Repository<T> {

    public T findById(int id) throws NotFoundException;
    public List<T> findAll();
    public void save(T newObject) throws SaveErrorException;
    public void update(T existingObject);
    public void delete(int id) throws NotFoundException;

}
