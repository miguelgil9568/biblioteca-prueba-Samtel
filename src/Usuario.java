import java.util.UUID;

class Usuario {
    private String nombre;
    private UUID id;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.id = UUID.randomUUID(); // Generar un identificador único aleatorio
    }

    public String getNombre() {
        return nombre;
    }

    public UUID getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", ID: " + id;
    }
}
