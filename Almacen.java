
import java.util.LinkedList;
import java.util.Comparator;
import java.util.Scanner;

public class Almacen {

    private LinkedList<Producto> listaProductos =
            new LinkedList<>();

    private Producto objetoProducto;
    private Scanner entrada = new Scanner(System.in);
    private BusquedaBinaria busqueda = new BusquedaBinaria();

    public void agregarProducto() {

        System.out.print("Nombre del producto: ");
        String nombre = entrada.nextLine();

        System.out.print("Precio del producto: ");
        double precio = Double.parseDouble(entrada.nextLine());

        objetoProducto = new Producto(nombre, precio);
        listaProductos.add(objetoProducto);

        System.out.println("Producto agregado correctamente.");
    }

    public void ordenarListaProductos() {

        listaProductos.sort(
            Comparator.comparingDouble(Producto::getPrecio)
        );

        System.out.println("Productos ordenados por precio.");
    }

    public void visualizarListaProductos() {

        if (listaProductos.isEmpty()) {
            System.out.println("No hay productos registrados.");
        } else {

            for (Producto producto : listaProductos) {
                System.out.println(
                    producto.getNombre() + " - $" +
                    producto.getPrecio()
                );
            }
        }
    }

    public void buscarProducto() {

        listaProductos.sort(
            Comparator.comparingDouble(Producto::getPrecio)
        );

        System.out.print("Precio a buscar: ");
        double precio = Double.parseDouble(entrada.nextLine());

        Producto encontrado =
                busqueda.buscar(listaProductos, precio);

        if (encontrado != null) {
            System.out.println("Producto encontrado: " +
                    encontrado.getNombre() + " - $" +
                    encontrado.getPrecio());
        } else {
            System.out.println("Producto no encontrado.");
        }
    }
}
