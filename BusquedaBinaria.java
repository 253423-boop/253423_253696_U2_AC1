
import java.util.LinkedList;

public class BusquedaBinaria {

    public Producto buscar(LinkedList<Producto> lista,
                           double precio) {

        int inicio = 0;
        int fin = lista.size() - 1;

        while (inicio <= fin) {

            int medio = (inicio + fin) / 2;

            Producto producto = lista.get(medio);

            if (producto.getPrecio() == precio) {
                return producto;
            }

            if (producto.getPrecio() < precio) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }

        return null;
    }
}
