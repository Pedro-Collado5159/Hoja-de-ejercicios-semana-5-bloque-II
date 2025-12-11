package MiniProyecto;
import java.time.LocalDateTime;

public class Movimiento {
    private LocalDateTime fecha;
    private String tipo;
    private double cantidad;
    private String descripcion;

    public Movimiento(String tipo, double cantidad, String descripcion) {
        this.fecha = LocalDateTime.now();
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return fecha + " | " + tipo + " | " + cantidad + "€ | " + descripcion;
    }
}
