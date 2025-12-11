public class CuentaAhorro extends CuentaBancaria {

    private double interes = 0.02; // 2%

    public CuentaAhorro(String iban, double saldo, Cliente titular) {
        super(iban, saldo, titular);
    }

    public double calcularInteres() {
        return saldo * interes;
    }

    @Override
    public String toString() {
        return "Cuenta Ahorro | " + super.toString();
    }
}
