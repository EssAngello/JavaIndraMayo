package indra.talentCamp.database.persistence;

import java.util.List;

@org.springframework.stereotype.Repository
public interface Repository<T> {
    public void save(T nuevo);
    public void update(T existente);
    public void delete(int id);

    public List<T> findAll();
    public T findById(int id) throws NotFoundException;

}
