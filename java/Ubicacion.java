public class Ubicacion {
    private int id;
    private String tipo; // Online o Presencial
    private String detalle;

    public Ubicacion(int id, String tipo, String detalle) {
        this.id = id;
        this.tipo = tipo;
        this.detalle = detalle;
    }

    public String getDescripcion() {
        return tipo.equals("Online") ? "Online: " + detalle : "Presencial en: " + detalle;
    }
}
