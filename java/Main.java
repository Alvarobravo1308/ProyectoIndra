public class Main {
    public static void main(String[] args) {
        Categoria cat = new Categoria(1, "Taller");
        Ubicacion ubi = new Ubicacion(1, "Presencial", "Centro Verde, Madrid");
        Organizador org = new Organizador(1, "EcoOrganiza", "eco@org.com");

        Evento e1 = new Evento(1, "Taller de Reciclaje", "2025-07-02", 3, cat, ubi, org);
        Evento e2 = new Evento(2, "Jornada Reforestación", "2025-08-10", 4, cat, ubi, org);

        GestorEventos gestor = new GestorEventos(10);
        gestor.agregarEvento(e1);
        gestor.agregarEvento(e2);

        System.out.println(" Lista de Eventos:");
        gestor.listarEventos();

        System.out.println("\n Detalles:");
        gestor.mostrarDetalles();
    }
}
