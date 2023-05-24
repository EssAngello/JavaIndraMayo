package indra.talentCamp.persistence;

import indra.talentCamp.models.Jedi;
import indra.talentCamp.persistence.interfaces.Repository;
import jdk.jshell.spi.ExecutionControl;

import java.util.LinkedList;
import java.util.List;

public class JediMockRepository implements Repository<Jedi> {

    private List<Jedi> jedis = new LinkedList<>();

    public List<Jedi> FindAll() throws Exception {
        throw new ExecutionControl.NotImplementedException("not implemented");
    }

    private int ultimoId(){
        return this.jedis.stream().mapToInt(j->j.getId()).max().orElse(0);
    }

    public Jedi findById(int id) throws NotFoundException{
        return this.jedis.stream().filter(j -> j.getId() == id).findFirst().orElseThrow(()->new NotFoundException());
    }

    @Override
    public List<Jedi> findAll() {
        return null;
    }

    public void save(Jedi jedi){
        jedi.setId(this.ultimoId()+1);
        this.jedis.add(jedi);
    }

    @Override
    public void update(Jedi existingObject) {

    }

    /*public void update(Jedi jedi) throws Exception{
        throw new ExecutionControl.NotImplementedException("not implemented");
    }*/

    public void delete(int id) throws NotFoundException{
        Jedi j = this.findById(id);
        this.jedis.remove(j);

    }

}
