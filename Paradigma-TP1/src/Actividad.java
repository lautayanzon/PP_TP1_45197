import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Actividad {

    private int id;
    private String titulo;
    private int cupoMaximo;
    public final int CUPO_MINIMO = 1;
    private List<Inscripcion> inscripciones = new ArrayList<>();

    public Actividad(int id, String titulo, int cupoMaximo) {
        this.cupoMaximo = cupoMaximo;
        this.titulo = titulo;
        this.id = id;
    }

    Inscripcion inscribir (Estudiante estudiante) {
        String estado = "Regular";
        LocalDate date = LocalDate.now();
        Inscripcion inscripcion = new Inscripcion(date, estado, estudiante);
        inscripciones.add(inscripcion);
        return inscripcion;
    }

    public List<Inscripcion> getInscripciones() {
        return inscripciones;
    }

    @Override
    public String toString() {
        return "Actividad{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", cupoMaximo=" + cupoMaximo +
                ", inscripciones=" + inscripciones +
                '}';
    }


}
