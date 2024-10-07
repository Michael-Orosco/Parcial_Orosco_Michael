public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.registrarContacto("12345678", "Juan", "Pérez", "Gerente");
        System.out.println("Cliente registrado con éxito.");
    }
}
public class Cliente {
    private String RUC;
    private String nombre;
    private String email;
    private String telefono;
    private String clave;

    public void registrarContacto(String DNI, String nombres, String apellidos, String puesto) {
        System.out.println("Contacto registrado: " + nombres + " " + apellidos + ", puesto: " + puesto);
    }
}