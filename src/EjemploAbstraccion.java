import Clases_Abstractas.GestorInventario;
import Clases_EjAbstraccion.InventarioDigital;
import Clases_EjAbstraccion.InventarioFisico;
import Clases_EjAbstraccion.InventarioVIP;

public class EjemploAbstraccion {

    public static void main(String[] args) {

        GestorInventario inventarioDigital = new InventarioDigital(10);
        GestorInventario inventarioFisico = new InventarioFisico(20);
        GestorInventario inventarioVIP = new InventarioVIP(30);

        System.out.println("Inventario Digital contiene la cantidad de " + inventarioDigital.getCantidad());
        System.out.println("Inventario Físico contiene la cantidad de " + inventarioFisico.getCantidad());
        System.out.println("Inventario VIP contiene la cantidad de " + inventarioVIP.getCantidad());


        inventarioDigital.añadirProducto("eBook de Java", 50);
        inventarioFisico.añadirProducto("Libro de Java", 30);
        inventarioVIP.añadirProducto("Libro BestSeller de Java", 30);

        inventarioDigital.eliminarProducto("eBook de Java");
        inventarioFisico.eliminarProducto("Libro de Java");
        inventarioVIP.eliminarProducto("Libro BestSeller de Java");


        inventarioDigital.actualizarStock("eBook de Java", 25);
        inventarioFisico.actualizarStock("Libro de Java", 15);
        inventarioVIP.actualizarStock("Libro BestSeller de Java", 15);

    }
}
