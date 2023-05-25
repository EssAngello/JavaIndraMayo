package indra.talentCamp.dependencyInjection.ioc;

public class BeanFactoryV1 {

    Repository repository;

    void registerRepository(Repository repository){
        this.repository = repository;
    }

    PartyService createPartyService(){
        return new PartyService(repository);
    }
}
