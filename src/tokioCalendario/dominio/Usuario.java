package tokioCalendario.dominio;

import static tokioCalendario.util.Constantes.TAMANO_INICIAL;

public class Usuario {

    private String nombre;
    private String contrasena;
    private String email;
    private String telefono;
    private String direccion;
    private String tipo;

    private Contactos[] contactos;
    private Eventos[] eventos;
    private Tareas[] tareas;


    public Usuario(String nombre, String contrasena, String email, String tipo) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.email = email;
        this.tipo = tipo;

        contactos = new Contactos[TAMANO_INICIAL];
        eventos = new Eventos[TAMANO_INICIAL];
        tareas = new Tareas[TAMANO_INICIAL];

    }

    public Usuario(String nombre, String contrasena, String email, String telefono,
                   String direccion, String tipo, Contactos[] contactos, Eventos[] eventos, Tareas[] tareas) {

        this(nombre, contrasena, email, tipo);

        this.telefono = telefono;
        this.direccion = direccion;
        this.contactos = contactos;
        this.eventos = eventos;
        this.tareas = tareas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Contactos[] getContactos() {
        return contactos;
    }

    public void setContactos(Contactos[] contactos) {
        this.contactos = contactos;
    }

    public Eventos[] getEventos() {
        return eventos;
    }

    public void setEventos(Eventos[] eventos) {
        this.eventos = eventos;
    }

    public Tareas[] getTareas() {
        return tareas;
    }

    public void setTareas(Tareas[] tareas) {
        this.tareas = tareas;
    }

    public void AnadirContactos(Contactos contactos) {

    }

    public void AnadirEventos(Eventos eventos) {

    }

    public void AnadirTareas(Tareas tareas) {

    }

    public void quitarContacto(Contactos contactos) {

    }

    public void quitarEventos(Eventos eventos) {

    }

    public void quitarTareas(Tareas tareas) {

    }
}
