import java.util.List;

public class EventoUniversitario {

    private final String id;
    private String titulo;
    private double costoBase;
    private boolean gratuito;
    private static int cantidadEventos = 0;

    Sala sala;
    Actividad actividad;

    public EventoUniversitario(String id, String titulo, double costoBase) {
        this.id = id;
        this.titulo = titulo;
        if (costoBase > 0) {
            this.costoBase = costoBase;
            this.gratuito = false;
        }
        cantidadEventos++;
    }

    public EventoUniversitario(String id, String titulo, boolean gratuito) {
        this.id = id;
        this.titulo = titulo;
        this.gratuito = gratuito;
        if (gratuito) {
            this.costoBase = 0;
        }
        cantidadEventos++;
    }

    public EventoUniversitario(EventoUniversitario otro) {
        this.id = otro.id;
        this.titulo = otro.titulo;
        this.costoBase = otro.costoBase;
        this.gratuito = otro.gratuito;
        cantidadEventos++;
    }

    double calcularCostoEstimado() {
        return 0;
    }

    void asignarSala(int id, String nombre) {
        this.sala = new Sala(id, nombre);
    }

    void crearActividad(int id, String titulo, int cupo) {
        this.actividad = new Actividad(id, titulo, cupo);
    }

    public Actividad getActividad() {
        return actividad;
    }

    void mostrarDatos() {
        System.out.println("Evento " + this.id);
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Costo Base: " + this.costoBase);
        System.out.println("Es gratuito? " + this.gratuito);
        System.out.println("Que sala tiene asignada? " + this.sala);
        System.out.println(this.actividad);
    }

    public static int getCantidadEventos() {
        return cantidadEventos;
    }
}
