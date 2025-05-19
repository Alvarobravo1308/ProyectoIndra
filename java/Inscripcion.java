public class Inscripcion {
    private Usuario usuario;
    private Evento evento;
    private String fechaInscripcion;

    public Inscripcion(Usuario usuario, Evento evento, String fechaInscripcion) {
        this.usuario = usuario;
        this.evento = evento;
        this.fechaInscripcion = fechaInscripcion;
    }

    public String getResumen() {
        return usuario.getNombre() + " inscrito en " + evento.getResumen();
    }
}
