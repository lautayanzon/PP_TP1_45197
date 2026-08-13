import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class Actividad {

    private int id;
    private String titulo;
    private int cupoMaximo;
    public final int CUPO_MINIMO;
    private static List<Inscripcion> inscripciones;

    public Actividad(int CUPO_MINIMO, int cupoMaximo, String titulo, int id) {
        this.CUPO_MINIMO = CUPO_MINIMO;
        this.cupoMaximo = cupoMaximo;
        this.titulo = titulo;
        this.id = id;
    }

    Inscripcion inscribir (Estudiante estudiante) {
        String estado = null;
        LocalDate date = null;
        Inscripcion inscripcion = new Inscripcion(date, estado);
        inscripciones.add(inscripcion);
        return inscripcion;
    }

    public static List<Inscripcion> getInscripciones() {
        return inscripciones;
    }
}
