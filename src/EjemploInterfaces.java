
import Interfaces.PagoEfectivo;
import Interfaces.PagoPayPal;
import Interfaces.PagoTarjeta;
import Interfaces.ProcesoPago;

public class
EjemploInterfaces {

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

        System.out.println();

        ProcesoPago pagoEfectivo = new PagoEfectivo();
        pagoEfectivo.iniciarPago(250.75);
        if (pagoEfectivo.verificarPago()) {
            pagoEfectivo.confirmarPago();
        }

        System.out.println();
    }
}

