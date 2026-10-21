
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Almacen almacen = new Almacen();
        int opcion;

        do {
            System.out.println("\nMENU ALMACEN");
            System.out.println("1 Agregar producto");
            System.out.println("2 Ordenar productos");
            System.out.println("3 Visualizar productos");
            System.out.println("4 Buscar producto");
            System.out.println("5 Salir");

            System.out.print("Elige una opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {

                case 1:
                    almacen.agregarProducto();
                    break;

                case 2:
                    almacen.ordenarListaProductos();
                    break;

                case 3:
                    almacen.visualizarListaProductos();
                    break;

                case 4:
                    almacen.buscarProducto();
                    break;

                case 5:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opcion incorrecta.");
            }

        } while (opcion != 5);
    }
}
