public class Evento {
    private int id;
    private String nombre;
    private String fecha;
    private int duracionHoras;
    private Categoria categoria;
    private Ubicacion ubicacion;
    private Organizador organizador;

    public Evento(int id, String nombre, String fecha, int duracionHoras,
                  Categoria categoria, Ubicacion ubicacion, Organizador organizador) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.duracionHoras = duracionHoras;
        this.categoria = categoria;
        this.ubicacion = ubicacion;
        this.organizador = organizador;
    }

    public String getResumen() {
        return id + ": " + nombre + " (" + fecha + ")";
    }

    public String getDetalle() {
        return getResumen() + " | " + categoria.getNombre() + " | " +
               ubicacion.getDescripcion() + " | Organizado por: " +
               organizador.getNombre();
    }
}
