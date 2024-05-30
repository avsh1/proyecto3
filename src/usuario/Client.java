package usuario;

public class Client {
    private int id;
    private String codigo;
    private String nombre;
    private String apellido;
    private String email;
    private int telefono;

    public Client() {
    }

    public Client(int id, String codigo, String nombre, String apellido, String email, int telefono) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefono() {
        return telefono;
    }
}