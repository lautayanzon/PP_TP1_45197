import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("111", "Juan"));
        estudiantes.add(new Estudiante("222", "Pedro"));
        estudiantes.add(new Estudiante("333", "Miguel"));


        EventoUniversitario evento1 = new EventoUniversitario("1", "Evento 1", 25000);
        evento1.asignarSala(1, "Sala Roja");

        EventoUniversitario evento2 = new EventoUniversitario("2", "Evento 2", true);
        evento2.asignarSala(2, "Sala Azul");

        EventoUniversitario evento3 = new EventoUniversitario(evento1);
        evento3.asignarSala(3, "Sala Verde");

        evento1.crearActividad(1, "Deportes", 1);
        evento2.crearActividad(2, "Ciencia", 5);
        evento3.crearActividad(3, "Arte", 25);

        evento1.getActividad().inscribir(estudiantes.get(0));
        evento2.getActividad().inscribir(estudiantes.get(1));
        evento3.getActividad().inscribir(estudiantes.get(2));

        evento1.mostrarDatos();
        evento2.mostrarDatos();
        evento3.mostrarDatos();

        System.out.println("Cantidad de Eventos: " + EventoUniversitario.getCantidadEventos());
    }
}
