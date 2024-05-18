import Clases.Producto_2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Producto_2 computadoraHP;
        computadoraHP = new Producto_2(1,"Computadora", "Computadora HP Corei5, 12GB Ram",
                1000, 20, 12);

        for (int i = 1; i <= 50; i++) {

            if (computadoraHP.existeStock()){
                computadoraHP.restarDelStock(1);
                System.out.println( i + ".- Se ha retirado de Stock un producto");
            } else {
                System.out.println("Ya no hay mas stock");
                break;
            }
        }

        System.out.println("Info del producto: " + computadoraHP.toString());
    }
}