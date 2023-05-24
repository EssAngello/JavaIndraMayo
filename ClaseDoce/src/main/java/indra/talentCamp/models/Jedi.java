package indra.talentCamp.models;

import java.awt.*;

public class Jedi extends BusinessObject{

    private String nombre;
    private int nivelDeFuerza;
    private Color colorLightSaber;

    public Jedi(String nombre, int nivelDeFuerza, Color colorLightSaber) {
        super();
        this.nombre = nombre;
        this.nivelDeFuerza = nivelDeFuerza;
        this.colorLightSaber = colorLightSaber;
    }

    public Jedi(String nombre, Color colorLightSaber) {
        super();
        this.nombre = nombre;
        this.nivelDeFuerza = 0;
        this.colorLightSaber = colorLightSaber;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivelDeFuerza() {
        return nivelDeFuerza;
    }

    public void setNivelDeFuerza(int nivelDeFuerza) {
        this.nivelDeFuerza = nivelDeFuerza;
    }

    public Color getColorLightSaber() {
        return colorLightSaber;
    }

    @Override
    public String toString() {
        return "Jedi{" +
                "nombre='" + nombre + '\'' +
                ", nivelDeFuerza=" + nivelDeFuerza +
                ", colorLightSaber=" + colorLightSaber +
                '}';
    }
}
