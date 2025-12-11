public class CuentaNomina extends CuentaBancaria {

    private String empresa;

    public CuentaNomina(String iban, double saldo, Cliente titular, String empresa) {
        super(iban, saldo, titular);
        this.empresa = empresa;
    }

    public void recibirNomina(double cantidad) {
        saldo += cantidad;
        System.out.println("Nómina recibida de " + empresa + ": +" + cantidad + "€");
    }

    @Override
    public String toString() {
        return "Cuenta Nómina | Empresa: " + empresa + " | " + super.toString();
    }
}
