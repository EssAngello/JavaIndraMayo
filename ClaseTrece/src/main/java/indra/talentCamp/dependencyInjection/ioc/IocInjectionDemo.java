package indra.talentCamp.dependencyInjection.ioc;

public class IocInjectionDemo {

    public static void aTodoGas(){
        BeanFactoryV1 factory = new BeanFactoryV1();
        factory.registerRepository(new DatabaseRepository());

        PartyService service = factory.createPartyService();
        service.haveFun();
    }



}
