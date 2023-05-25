package indra.talentCamp.dependencyInjection.constructor;

public class ConstructorInjectionDemo {

    public static void aTodoGas(){
        //Tiempo de configuracion
        PartyService partyService = new PartyService( new DatabaseRepository() );

        //Tiempo de ejecucion
        partyService.haveFun();
    }

}
