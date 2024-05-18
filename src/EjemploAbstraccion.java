import Clases_Abstractas.GestorInventario;
import Clases_EjAbstraccion.InventarioDigital;
import Clases_EjAbstraccion.InventarioFisico;
import Clases_EjHerencia.Entrenador;
import Clases_EjHerencia.Jugador;
import Clases_EjHerencia.Masajista;

public class EjemploAbstraccion {

    public static void main(String[] args) {

        GestorInventario inventarioDigital = new InventarioDigital();
        GestorInventario inventarioFisico = new InventarioFisico();


        inventarioDigital.añadirProducto("eBook de Java", 50);
        inventarioFisico.añadirProducto("Libro de Java", 30);


        inventarioDigital.eliminarProducto("eBook de Java");
        inventarioFisico.eliminarProducto("Libro de Java");


        inventarioDigital.actualizarStock("eBook de Java", 25);
        inventarioFisico.actualizarStock("Libro de Java", 15);

    }
}
