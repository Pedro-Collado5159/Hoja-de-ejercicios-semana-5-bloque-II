import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Ana", "123A", "ana@mail.com");
        Cliente c2 = new Cliente("Luis", "456B", "luis@mail.com");

        ArrayList<CuentaBancaria> cuentas = new ArrayList<>();

        cuentas.add(new CuentaAhorro("ES100", 2000, c1));
        cuentas.add(new CuentaNomina("ES200", 500, c2, "Google"));
        cuentas.add(new CuentaAhorro("ES300", 3500, c2));

        //  Buscar por DNI
        String dniBuscado = "456B";

        System.out.println("=== Buscando cuentas del DNI " + dniBuscado + " ===");

        for (CuentaBancaria cuenta : cuentas) {
            if (cuenta.getTitular().getDNI().equals(dniBuscado)) {
                System.out.println(cuenta);

                // Polimorfismo:
                if (cuenta instanceof CuentaAhorro) {
                    CuentaAhorro ca = (CuentaAhorro) cuenta;
                    System.out.println("Interés generado: " + ca.calcularInteres());
                }

                if (cuenta instanceof CuentaNomina) {
                    CuentaNomina cn = (CuentaNomina) cuenta;
                    cn.recibirNomina(1500);
                }
            }
        }
    }
}
