package indra.talentCamp.dependencyInjection.reflection;

public class MockRepository implements Repository {
    @Override
    public void Save() {
        System.out.println("MockRepository: soy un entorno controlado para probar");
    }
}
