package indra.talentCamp.dependencyInjection.field;

public class PartyService {

    private Repository repository = null;

    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    public void haveFun() {
        assert this.repository != null;

        System.out.println("Everybody have fun tonight");
        System.out.println("Pero luego de divertirnos hay que guardarlo todo en el repo");
        this.repository.Save();
    }


}
