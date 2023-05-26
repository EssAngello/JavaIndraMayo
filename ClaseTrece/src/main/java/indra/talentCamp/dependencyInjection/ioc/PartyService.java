package indra.talentCamp.dependencyInjection.ioc;

public class PartyService {

    private Repository repository;

    PartyService(Repository repository) {
        this.repository = repository;
    }

    public PartyService(){
        super();
    }

    public void haveFun() {
        System.out.println("Everybody have fun tonight");
        System.out.println("Pero luego de divertirnos hay que guardarlo todo en el repo");
        this.repository.Save();
    }
}
