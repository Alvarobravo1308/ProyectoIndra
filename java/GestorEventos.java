public class GestorEventos {
    private Evento[] eventos;
    private int total;

    public GestorEventos(int maxEventos) {
        eventos = new Evento[maxEventos];
        total = 0;
    }

    public void agregarEvento(Evento evento) {
        if (total < eventos.length) {
            eventos[total] = evento;
            total++;
        } else {
            System.out.println("No se pueden agregar más eventos.");
        }
    }

    public void listarEventos() {
        for (int i = 0; i < total; i++) {
            System.out.println(eventos[i].getResumen());
        }
    }

    public void mostrarDetalles() {
        for (int i = 0; i < total; i++) {
            System.out.println(eventos[i].getDetalle());
        }
    }
}
