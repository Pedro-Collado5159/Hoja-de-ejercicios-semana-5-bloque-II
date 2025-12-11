package MiniProyecto;

import java.util.ArrayList;

public class CuentaBancaria {
    protected String iban;
    protected double saldo;
    protected Cliente titular;
    protected ArrayList<Movimiento> movimientos;

    public CuentaBancaria(String iban, double saldo, Cliente titular) {
        this.iban = iban;
        this.saldo = saldo;
        this.titular = titular;
        this.movimientos = new ArrayList<>();
    }

    public void añadirMovimiento(String tipo, double cantidad, String descripcion) {
        movimientos.add(new Movimiento(tipo, cantidad, descripcion));
    }

    public void mostrarMovimientos() {
        System.out.println("=== Movimientos de la cuenta " + iban + " ===");
        for (Movimiento m : movimientos) {
            System.out.println(m);
        }
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            añadirMovimiento("Ingreso", cantidad, "Depósito en cuenta");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            añadirMovimiento("Retiro", cantidad, "Retirada en cajero");
        }
    }

    public void transferirA(CuentaBancaria destino, double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            this.saldo -= cantidad;
            destino.saldo += cantidad;

            this.añadirMovimiento("Transferencia enviada", cantidad,
                    "A cuenta " + destino.iban);

            destino.añadirMovimiento("Transferencia recibida", cantidad,
                    "De cuenta " + this.iban);
        }
    }
}
