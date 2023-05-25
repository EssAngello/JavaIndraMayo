package indra.talentCamp.dependencyInjection.constructor;

public class PartyService {

    private Repository repository;

    public PartyService(Repository repository) {
        this.repository = repository;
    }

    public void haveFun() {
        System.out.println("Everybody have fun tonight");
        System.out.println("Pero luego de divertirnos hay que guardarlo todo en el repo");
        this.repository.Save();
    }
}
