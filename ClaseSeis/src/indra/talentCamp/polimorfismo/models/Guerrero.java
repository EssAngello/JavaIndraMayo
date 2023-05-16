package indra.talentCamp.polimorfismo.models;

import javax.sql.rowset.serial.SQLOutputImpl;

public class Guerrero extends Jugador{

    public Guerrero(String nombre) {
        super(nombre);
    }

    @Override
    public void accion(Jugador enemigo) {
        System.out.printf("%s Ha danyado %d puntos de fuerza a %s\n",
                this.getNombre(), this.getFuerza(), enemigo.getNombre());
        enemigo.setHp(enemigo.getHp() - this.getFuerza());
    }
}
