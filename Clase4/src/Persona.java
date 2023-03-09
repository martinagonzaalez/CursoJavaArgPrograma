import java.time.LocalDateTime;

public class Persona {
    private String nombre;
    private LocalDateTime fechaNacimiento;

    public Persona(String nombre, LocalDateTime fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }
}

