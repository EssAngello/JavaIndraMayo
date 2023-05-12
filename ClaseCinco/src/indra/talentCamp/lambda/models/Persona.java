package indra.talentCamp.lambda.models;

public class Persona {

    private String nombre;
    private int centimetrosAltura;

    public Persona(String nombre, int centimetrosAltura) {
        super();
        this.nombre = nombre;
        this.setCentimetrosAltura(centimetrosAltura);
    }

    public String getNombre() {
        return nombre;
    }

    public int getCentimetrosAltura() {
        return centimetrosAltura;
    }

    public void setCentimetrosAltura(int centimetrosAltura) {
        //Uso Error para no estar obligado a capturar la excepcion o poner throws
        if(centimetrosAltura > 300) throw new Error("No se puede medir mas de 300cm");
        if(centimetrosAltura < 0) throw new Error("No se puede medir menos que 0cm");

        //assert (centimetrosAltura > 300); //otra alternativa
        //assert(centimetrosAltura < 0); //otra alternativa

        this.centimetrosAltura = centimetrosAltura;
    }

    @Override
    public String toString() {
        return this.getNombre();
    }
}
