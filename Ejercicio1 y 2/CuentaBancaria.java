public class CuentaBancaria {
    protected String iban;
    protected double saldo;
    protected Cliente titular;

    public CuentaBancaria(String iban, double saldo, Cliente titular) {
        this.iban = iban;
        this.saldo = saldo;
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) saldo += cantidad;
    }

    @Override
    public String toString() {
        return "IBAN: " + iban + " | Saldo: " + saldo + "€ | Titular: " + titular;
    }
}
