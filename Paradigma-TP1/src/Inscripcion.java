import java.time.LocalDate;

public class Inscripcion {

    private LocalDate fecha;
    private String estado;

    public Inscripcion(LocalDate fecha, String estado) {
        this.fecha = fecha;
        this.estado = estado;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Inscripcion{" +
                "fecha=" + fecha +
                ", estado='" + estado + '\'' +
                '}';
    }
}
