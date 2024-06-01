import ClasesBases.Producto;
import Clases_EjPolimorfismo.ProductoDigital;
import Clases_EjPolimorfismo.ProductoFisico;
import Patrones.BankAccount;
import Patrones.BankExpense;
import Patrones.ConfiguracionSistema;
import Patrones.ProductoFactory;

import java.util.HashMap;
import java.util.Map;

public class EjemploPatrones {

    public static void main(String[] args) {

        ConfiguracionSistema configuracionSistema = ConfiguracionSistema.getInstance();

        System.out.println(configuracionSistema.getParamBD("user"));
        System.out.println(configuracionSistema.getParamUI("idioma"));

        configuracionSistema.setParamBD("user", "ecommerce_user");
        System.out.println(configuracionSistema.getParamBD("user"));



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

        Map<String, String> parametrosProductoVIP = new HashMap<>();
        parametrosProductoFisico.put("ID", "1");
        parametrosProductoFisico.put("Nombre", "Membresía Golden");
        parametrosProductoFisico.put("precio", "100");
        parametrosProductoFisico.put("bonus", "35%");
        Producto productoVIP= ProductoFactory.crearProducto("vip", parametrosProductoFisico );


        System.out.println("Precio Producto Digital " +  productoDigital.calcularPrecio()); //10%
        System.out.println("Precio Producto Fìsico " +   productoFisico.calcularPrecio());  //12%
        System.out.println("Precio Producto VIP " +   productoVIP.calcularPrecio());  //12%

        productoDigital.entrega();
        productoFisico.entrega();
        productoVIP.entrega();



        // Observable class
        BankAccount bankAccount = new BankAccount();

        // Observer class
        BankExpense bankExpense1 = new BankExpense("commission", 0.11d);
        BankExpense bankExpense2 = new BankExpense("expense", 0.22d);
        BankExpense bankExpense3 = new BankExpense("compensation", 0.33d);

        // Add Observer into Observable
        bankAccount.addObserver(bankExpense1);
        bankAccount.addObserver(bankExpense2);
        bankAccount.addObserver(bankExpense3);

        // Change Observable state
        bankAccount.addAmount(5000d);

        // Observer was notified
        System.out.println(bankExpense1.toString());
        System.out.println(bankExpense2.toString());
        System.out.println(bankExpense3.toString());

    }

}
