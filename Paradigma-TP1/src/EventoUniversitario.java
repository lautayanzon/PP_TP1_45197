public class EventoUniversitario {

    private final String id;
    private String titulo;
    private double costoBase;
    private boolean gratuito;
    private static int cantidadEventos = 0;

    Sala sala;

    public EventoUniversitario(String id, String titulo, double costoBase, boolean gratuito) {
        this.id = id;
        this.titulo = titulo;
        this.costoBase = costoBase;
        this.gratuito = gratuito;
        cantidadEventos++;
    }

    public EventoUniversitario (EventoUniversitario otro) {
        this.id = otro.id;
        this.titulo = otro.titulo;
        this.costoBase = otro.costoBase;
        this.gratuito = otro.gratuito;
        cantidadEventos++;
    }

    double calcularCostoEstimado () {
        return 0;
    }

    void asignarSala (int id, String nombre) {
        this.sala = new Sala(id, nombre);
    }

    void crearActividad (int id, String titulo, int cupo) {
        Actividad actividad = new Actividad(1, 1, titulo, id);
    }

    void mostrarDatos() {
        System.out.println("Evento " + this.id);
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Costo Base: " + this.costoBase);
        System.out.println("Es gratuito? " + this.gratuito);
    }

    public static int getCantidadEventos() {
        return cantidadEventos;
    }
}
