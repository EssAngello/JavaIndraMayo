package indra.talentCamp.dependencyInjection.constructor;

public class DatabaseRepository implements Repository {

    @Override
    public void Save() {
        System.out.println("DatabaseRepository: Hago un INSERT INTO y grabo en la base de datos");
    }

}
