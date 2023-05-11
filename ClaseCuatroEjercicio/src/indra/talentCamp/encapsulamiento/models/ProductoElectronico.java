package indra.talentCamp.encapsulamiento.models;

public class ProductoElectronico {

    private String nombre;
    private double precio;
    private int cantidad;
    private String marca;

    public ProductoElectronico(String nombre, double precio, int cantidad, String marca) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean actualizarProductoVendido(int cantidadVendida) {
        if(this.cantidad<cantidadVendida){
            return false;
        } else{
            this.cantidad-=cantidadVendida;
            return true;
        }
    }

}
