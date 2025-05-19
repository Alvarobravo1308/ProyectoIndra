public class Organizador {
    private int id;
    private String nombre;
    private String contacto;

    public Organizador(int id, String nombre, String contacto) {
        this.id = id;
        this.nombre = nombre;
        this.contacto = contacto;
    }

    public String getNombre() {
        return nombre;
    }
}
