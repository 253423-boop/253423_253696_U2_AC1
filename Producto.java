
public class Producto {

    private String nombre;
    private double precio;

    public Producto(String n, double p) {
        nombre = n;
        precio = p;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String n) {
        nombre = n;
    }

    public void setPrecio(double p) {
        precio = p;
    }
}
