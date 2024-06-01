import ClasesBases.Producto;
import Clases_EjPolimorfismo.ProductoDigital;
import Clases_EjPolimorfismo.ProductoFisico;
import Patrones.ConfiguracionSistema;
import Patrones.ProductoFactory;

import java.util.HashMap;
import java.util.Map;

public class EjemploPatrones {

    public static void main(String[] args) {

        ConfiguracionSistema configuracionSistema = ConfiguracionSistema.getInstance();

        System.out.println(configuracionSistema.getParamBD("user"));
        System.out.println(configuracionSistema.getParamUI("idioma"));


        Map<String, String> parametrosProductoDigital = new HashMap<>();
        parametrosProductoDigital.put("ID", "1");
        parametrosProductoDigital.put("Nombre", "Membresìa InternetTV");
        parametrosProductoDigital.put("precio", "100");
        Producto productoDigital = ProductoFactory.crearProducto("digital", parametrosProductoDigital);

        Map<String, String> parametrosProductoFisico = new HashMap<>();
        parametrosProductoFisico.put("ID", "1");
        parametrosProductoFisico.put("Nombre", "Membresìa InternetTV");
        parametrosProductoFisico.put("precio", "100");
        Producto productoFisico= ProductoFactory.crearProducto("fisico", parametrosProductoFisico );

        System.out.println("Precio Producto Digital " +  productoDigital.calcularPrecio()); //10%
        System.out.println("Precio Producto Fìsico " +   productoFisico.calcularPrecio());  //12%

        productoDigital.entrega();
        productoFisico.entrega();

    }

}
