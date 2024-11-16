package Interfaces;

public class PagoTarjeta implements ProcesoPago {
    private double monto;

    @Override
    public void iniciarPago(double monto) {
        this.monto = monto;
        System.out.println("Iniciando pago con tarjeta por el monto: $" + monto);
    }

    @Override
    public boolean verificarPago() {
        System.out.println("Verificando el pago con tarjeta...");
        return true;
    }

    @Override
    public void confirmarPago() {
        System.out.println("Pago con tarjeta confirmado por el monto: $" + monto);
    }
}
