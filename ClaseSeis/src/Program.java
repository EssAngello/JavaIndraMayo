import indra.talentCamp.polimorfismo.models.Guerrero;
import indra.talentCamp.polimorfismo.models.Jugador;
import indra.talentCamp.polimorfismo.models.Mago;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Jugador excalibur = new Guerrero("Excalibur");
        Jugador batman = new Guerrero("Batman");
        Jugador thanos = new Mago("Thanos");

        List<Jugador> personajes = new ArrayList<>();
        personajes.add(excalibur);
        personajes.add(batman);
        personajes.add(thanos);

        //comienzo del turno
        System.out.println("Comienzo del turno");
        personajes.forEach(System.out::println);
        System.out.println("--------------------------------");

        batman.accion(excalibur);
        thanos.accion(excalibur);

        personajes.forEach(p -> p.finalizarTurno());

        //Fin del turno
        System.out.println("--------------------------------");
        System.out.println("Fin del turno");
        //personajes.forEach(System.out::println);
        //mostrar los que quedaron vivos
        personajes.stream().filter(n -> n.estaVivo()).forEach(System.out::println);
    }
}
