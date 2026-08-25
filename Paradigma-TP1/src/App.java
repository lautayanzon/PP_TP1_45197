import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("111", "Juan P."));
        estudiantes.add(new Estudiante("222", "Pedro M."));
        estudiantes.add(new Estudiante("333", "Miguel A."));

        EventoUniversitario evento1 = new EventoUniversitario("1", "Evento Universitario", 25000);

        Sala sala1 = new Sala(1, "Sala Zoom");
        evento1.asignarSala(sala1);


        evento1.crearActividad(1, "Salud", 10, "Charla");
        evento1.crearActividad(1, "Tecnologia", 15, "Taller");

        evento1.getActividad().get(0).inscribir(estudiantes.get(0));
        evento1.getActividad().get(0).inscribir(estudiantes.get(1));
        evento1.getActividad().get(1).inscribir(estudiantes.get(1));
        evento1.getActividad().get(1).inscribir(estudiantes.get(2));

        evento1.mostrarDatos();

        System.out.println("Cantidad de Eventos: " + EventoUniversitario.getCantidadEventos());
    }
}
