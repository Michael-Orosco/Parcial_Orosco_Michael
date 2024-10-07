import java.util.ArrayList;
import java.util.Date;

class Cliente {
    private String RUC;
    private String nombre;
    private String email;
    private String telefono;
    private Date date;
    private String clave;
    private Contacto contacto;
    private ArrayList<Oferta> ofertas = new ArrayList<>();

    public Cliente(String RUC, String nombre, String email, String telefono, Date date, String clave) {
        this.RUC = RUC;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.date = date;
        this.clave = clave;
    }

    public boolean agregarOferta(Oferta oferta) {
        return ofertas.add(oferta);
    }

    public boolean eliminarOferta(Oferta oferta) {
        return ofertas.remove(oferta);
    }

    public void registrarContacto(String DNI, String nombres, String apellidos, String puesto) {
        this.contacto = new Contacto(DNI, nombres, apellidos, puesto);
    }
}

class Contacto {
    private String DNI;
    private String nombres;
    private String apellidos;
    private String puesto;

    public Contacto(String DNI, String nombres, String apellidos, String puesto) {
        this.DNI = DNI;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.puesto = puesto;
    }
}

class Oferta {
    private String puesto;
    private String descripcion;
    private String area;
    private Date fechaInicio;
    private Date fechaTermino;
    private ArrayList<Requisito> requisitos = new ArrayList<>();

    public Oferta(String puesto, String descripcion, String area, Date fechaInicio, Date fechaTermino) {
        this.puesto = puesto;
        this.descripcion = descripcion;
        this.area = area;
        this.fechaInicio = fechaInicio;
        this.fechaTermino = fechaTermino;
    }

    public boolean agregarRequisito(int orden, String descripcion) {
        return requisitos.add(new Requisito(orden, descripcion));
    }

    public boolean eliminarRequisito(int orden) {
        for (Requisito req : requisitos) {
            if (req.getOrden() == orden) {
                return requisitos.remove(req);
            }
        }
        return false;
    }
}

class Requisito {
    private int orden;
    private String descripcion;
    private boolean estado;

    public Requisito(int orden, String descripcion) {
        this

}
