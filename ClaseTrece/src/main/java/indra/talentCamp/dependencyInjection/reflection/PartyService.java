package indra.talentCamp.dependencyInjection.reflection;

public class PartyService {

    static private Class<? extends Repository> repositoryClass;

    public static void registerRepositoryClass(Class<? extends Repository> repositoryClass){
        PartyService.repositoryClass = repositoryClass;
    }

    private Repository repository;

    public PartyService(){
        if(PartyService.repositoryClass==null){
            throw new Error("Te olvidaste de configurar el PartyService");
        }

        try {
            //Esta forma sirve solamente para las clases que tienen constructores sin parametros
            this.repository = PartyService.repositoryClass.newInstance();
        } catch (Exception e) {
            throw new Error("El constructor es privado");
        }
    }

    public void haveFun() {
        System.out.println("Everybody have fun tonight");
        System.out.println("Pero luego de divertirnos hay que guardarlo todo en el repo");
        this.repository.Save();
    }
}
