import excepciones.CupoExcedidoException;
import modelo.Estudiante;
import modelo.EventoUniversitario;
import modelo.Sala;
import modelo.actividades.Actividad;
import modelo.actividades.Curso;
import modelo.actividades.Taller;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) throws CupoExcedidoException {

        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("111", "Juan P."));
        estudiantes.add(new Estudiante("222", "Pedro M."));
        estudiantes.add(new Estudiante("333", "Miguel A."));

        EventoUniversitario evento1 = new EventoUniversitario("1", "Evento Universitario", 25000);

        Sala sala1 = new Sala(1, "Sala Zoom");
        evento1.asignarSala(sala1);

        evento1.asignarSala(sala1);


        evento1.crearActividad(1, "Salud", 10, "Charla");
        evento1.crearActividad(1, "Tecnologia", 15, "Taller");
        evento1.crearActividad(1, "Ciber Seguridad", 10, "Curso");

        try {
            evento1.getActividad().get(0).inscribir(estudiantes.get(0));
            evento1.getActividad().get(0).inscribir(estudiantes.get(1));
            evento1.getActividad().get(1).inscribir(estudiantes.get(1));
            evento1.getActividad().get(1).inscribir(estudiantes.get(2));
            evento1.getActividad().get(2).inscribir(estudiantes.get(1));
            evento1.getActividad().get(2).inscribir(estudiantes.get(2));
        } catch (CupoExcedidoException e) {
            System.out.println(e.getMessage());
        }

        boolean b = evento1.persistirEvento();

        EventoUniversitario evento2 = EventoUniversitario.recuperarEvento("1");
        evento2.mostrarDatos();

        List<Taller> talleres = evento2.filtrarActividadesPorTipo(Taller.class);
        List<Curso> cursos = evento2.filtrarActividadesPorTipo(Curso.class);

        System.out.println("Certificados Emitidos:");
        for (Taller taller: talleres){
            System.out.println(taller.generarCertificado(estudiantes.get(1)));
        }

        System.out.println("Cantidad de Eventos: " + EventoUniversitario.getCantidadEventos());
    }
}
