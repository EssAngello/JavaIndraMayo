package indra.talentCamp.encapsulamiento.models;

public class Teacher extends Person {

    private String preferedLanguage;

    public Teacher(String name, int document, String address) {
        super(name, document, address);
        this.preferedLanguage = "Espanyol"; //inicializando un valor con un valor por defecto
    }

    public Teacher(String name, int document, String address, String preferedLanguage) {
        super(name, document, address);
        this.preferedLanguage = preferedLanguage;
    }

    public String getPreferedLanguage() {
        return preferedLanguage;
    }

    public void setPreferedLanguage(String preferedLanguage) {
        this.preferedLanguage = preferedLanguage;
    }

    @Override
    public String toString() {
        return this.getName() + " (Documento: " + this.getDocument() + ") \n[" + this.getAddress() + "] \nEspecialista en " + this.getPreferedLanguage();
    }

}
