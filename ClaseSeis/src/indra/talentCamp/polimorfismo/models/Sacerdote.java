package indra.talentCamp.polimorfismo.models;

public class Sacerdote extends Jugador {

    public Sacerdote(String nombre) {
        super(nombre);
    }

    @Override
    public void accion(Jugador enemigo) {
        System.out.printf("%s Cura a %s por %d puntos de daño\n" ,
                this.getNombre(), enemigo.getNombre(), this.getDestreza());
        enemigo.setHp(enemigo.getHp() + this.getDestreza());
    }
}
