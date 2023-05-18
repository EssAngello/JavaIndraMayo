package models;

public class Cliente {
    private String nombre;
    private String numeroIdentificacion;

    public Cliente(String nombre, String numeroIdentificacion) {
        this.nombre = nombre;
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getNombre() {
        return nombre;
    }
}
