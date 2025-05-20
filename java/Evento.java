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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(int duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Organizador getOrganizador() {
        return organizador;
    }

    public void setOrganizador(Organizador organizador) {
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