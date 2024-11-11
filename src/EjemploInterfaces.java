
import Interfaces.PagoPayPal;
import Interfaces.PagoTarjeta;
import Interfaces.ProcesoPago;

public class EjemploInterfaces {

    public static void main(String[] args) {

        ProcesoPago pagoTarjeta = new PagoTarjeta();
        pagoTarjeta.iniciarPago(150.75);
        if (pagoTarjeta.verificarPago()) {
            pagoTarjeta.confirmarPago();
        }

        System.out.println();

        ProcesoPago pagoPayPal = new PagoPayPal();
        pagoPayPal.iniciarPago(250.50);
        if (pagoPayPal.verificarPago()) {
            pagoPayPal.confirmarPago();
        }
    }
}

