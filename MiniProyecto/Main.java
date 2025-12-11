package MiniProyecto;

public class Main {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Ana", "123A", "ana@mail.com");
        Cliente c2 = new Cliente("Luis", "456B", "luis@mail.com");

        CuentaBancaria cuenta1 = new CuentaBancaria("ES100", 1000, c1);
        CuentaBancaria cuenta2 = new CuentaBancaria("ES200", 500, c2);

        // Operaciones simuladas
        cuenta1.depositar(300);
        cuenta1.retirar(150);
        cuenta1.transferirA(cuenta2, 200);

        cuenta2.depositar(50);

        // Mostrar historial
        cuenta1.mostrarMovimientos();
        System.out.println();
        cuenta2.mostrarMovimientos();
    }
}

