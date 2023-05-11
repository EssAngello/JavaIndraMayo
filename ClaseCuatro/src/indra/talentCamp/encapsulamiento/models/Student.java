package indra.talentCamp.encapsulamiento.models;

public class Student extends Person {

    /*private String name;
    private int document;
    private String address;*/
    private boolean prefersFrontEnd;

    public Student(String name, int document, String address) {
        /*this.name = name;
        this.document = document;
        this.address = address;*/
        super(name, document, address);
        this.prefersFrontEnd = false; //inicializando un valor con un valor por defecto
    }

    public Student(String name, int document, String address, boolean prefersFrontEnd) {
        /*this.name = name;
        this.document = document;
        this.address = address;*/
        super(name, document, address);
        this.prefersFrontEnd = prefersFrontEnd;
    }

    /*public String getName() {
        return name;
    }*/ //readOnly

    //comento el setter para que solo sea readOnly
    /*public void setName(String name) {
        this.name = name;
    }*/

    /*public int getDocument() {
        return document;
    }*/

    //el documento tambien es readOnly
    /*public void setDocument(int document) {
        this.document = document;
    }*/

    /*public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }*/

    public boolean isPrefersFrontEnd() {
        return prefersFrontEnd;
    }

    public void setPrefersFrontEnd(boolean prefersFrontEnd) {
        this.prefersFrontEnd = prefersFrontEnd;
    }

    @Override
    public String toString() {
        /*return this.getName() + " (Documento: " + this.getDocument() + ") \n[" + this.getAddress() + "] \n" +
                (this.isPrefersFrontEnd()? "Entusiasta de FrontEnd" : " Entusiasta de Back-end");*/

        return String.format("%s (Documento %d) \n[%s] \n%s",
                this.getName(),
                this.getDocument(),
                this.getAddress(),
                (this.isPrefersFrontEnd()? "Entusiasta de FrontEnd" : " Entusiasta de Back-end"));
    }
}
