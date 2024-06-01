import Clases_EjPolimorfismo.ProductoDigital;
import Clases_EjPolimorfismo.ProductoFisico;

public class EjemploPolimorfismo {
    public static void main(String[] args) {

        ProductoDigital productoDigital = new ProductoDigital(1, "Membresìa InternetTV", 100);
        ProductoFisico productoFisico= new ProductoFisico(2, "TV", 100);

        System.out.println("Precio Producto Digital " +  productoDigital.calcularPrecio()); //10%
        System.out.println("Precio Producto Fìsico " +   productoFisico.calcularPrecio());  //12%

        productoDigital.entrega();
        productoFisico.entrega();


    }
}
