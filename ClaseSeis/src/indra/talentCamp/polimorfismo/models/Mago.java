package indra.talentCamp.polimorfismo.models;

public class Mago extends Jugador {

    private int poderMagico;
    private int mana;

    public Mago(String nombre) {
        super(nombre);
        this.poderMagico = 10;
        this.mana = 100;
    }

    @Override
    public void accion(Jugador enemigo) {
        if(mana>poderMagico) {
            enemigo.setModFuerza(-this.poderMagico);
            this.mana -= poderMagico;
        }
    }

    @Override
    public void finalizarTurno(){
        //Este es otro escenario donde en vez de finalizar el comportamiento, lo extiendo
        super.finalizarTurno();
        this.mana =+ 1;
    }

}
