package indra.talentCamp.polimorfismo.models;

public abstract class Jugador {
    private String nombre;
    private int hp;
    private int fuerza;
    private int modFuerza;
    private int destreza;

    //private int tipoJugador=1; //1-Guerrero, 2-Sacerdote, 3-Mago

    public Jugador(String nombre){
        this.nombre = nombre;
        this.hp = 50;
        this.fuerza = 50;
        this.destreza = 50;
        this.modFuerza = 0;

        //this.tipoJugador = tipoJugador;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHp() {
        return hp;
    }

    protected void setHp(int hp) {
        this.hp = hp;
    }

    public int getFuerza() {
        return fuerza;
    }

    protected void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public void setModFuerza(int modFuerza) {
        this.modFuerza = modFuerza;
    }

    public int getDestreza() {
        return destreza;
    }

    protected void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public abstract void accion(Jugador enemigo);

    public boolean estaVivo(){
        if(this.hp <= 0){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public String toString() {
        return String.format("Nuestro personaje %s, llamado %s \n Tiene una salud: %d \n Tiene una destreza: %d \n Tiene fuerza : %d"  ,
                this.getClass().getSimpleName(),
                this.nombre,
                this.hp,
                this.destreza,
                this.fuerza);
    }

    public void finalizarTurno(){
        //vuelven sus stats (fuerza, destreza) a su valor original
        this.modFuerza = 0;
    }
}
