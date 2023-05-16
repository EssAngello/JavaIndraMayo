import indra.talentCamp.polimorfismo.models.Animal;
import indra.talentCamp.polimorfismo.models.Gato;
import indra.talentCamp.polimorfismo.models.Perro;
import indra.talentCamp.polimorfismo.models.Vaca;

public class Program {

    public static void main(String[] args) {
        Animal animal1 = new Perro();
        Animal animal2 = new Gato();
        Animal animal3 = new Vaca();

        animal1.hacerSonido(); // Salida: El perro ladra
        animal2.hacerSonido(); // Salida: El gato maulla
        animal3.hacerSonido(); // Salida: La vaca muge
    }

}
