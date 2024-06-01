package Patrones;

import ClasesBases.Producto;
import Clases_EjPolimorfismo.ProductoDigital;
import Clases_EjPolimorfismo.ProductoFisico;

import java.util.Map;

public class ProductoFactory {

    public static Producto crearProducto( String tipoProducto, Map<String, String> parametros) {
        if (tipoProducto.equalsIgnoreCase("digital")) {
            return new ProductoDigital(
                    Integer.parseInt(parametros.get("ID")),
                    parametros.get("Nombre"),
                    Double.parseDouble(parametros.get("precio")));

        } else if (tipoProducto.equalsIgnoreCase("fisico")) {
            return new ProductoFisico(
                    Integer.parseInt(parametros.get("ID")),
                    parametros.get("Nombre"),
                    Double.parseDouble(parametros.get("precio")));
        } else {
            throw new IllegalArgumentException("Tipo de producto no válido: " + tipoProducto);
        }
    }

}
