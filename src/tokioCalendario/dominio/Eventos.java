package tokioCalendario.dominio;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static tokioCalendario.util.Constantes.ALERTA;
import static tokioCalendario.util.Constantes.TIEMPOALERTA;

public class Eventos {

    private String nombre;
    private String descripcion;
    private String lugar;
    private LocalDate date;
    private String alerta;
    private int tiempoalerta;
    private boolean tieneconstructor;

    private Usuario propietario;

    public Eventos(String nombre, String descripcion, String lugar, LocalDate date, Usuario propietario) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.lugar = lugar;
        this.date = date;
        this.alerta = ALERTA;
        this.tiempoalerta = TIEMPOALERTA;
        this.propietario = propietario;
        tieneconstructor = false;

    } public Eventos(String nombre, String descripcion, String lugar, LocalDate date, Usuario propietario,
                     boolean tieneconstructor) {
            this(nombre,descripcion,lugar,date,propietario);

            this.tieneconstructor = tieneconstructor;
            if(tieneconstructor) {
                this.alerta = ALERTA;
                this.tiempoalerta = TIEMPOALERTA;
            }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getAlerta() {
        return alerta;
    }

    public void setAlerta(String alerta) {
        this.alerta = alerta;
    }

    public int getTiempoalerta() {
        return tiempoalerta;
    }

    public void setTiempoalerta(int tiempoalerta) {
        this.tiempoalerta = tiempoalerta;
    }

    public boolean isTieneconstructor() {
        return tieneconstructor;
    }

    public void setTieneconstructor(boolean tieneconstructor) {
        this.tieneconstructor = tieneconstructor;
    }

    public Usuario getPropietario() {
        return propietario;
    }

    public void setPropietario(Usuario propietario) {
        this.propietario = propietario;
    }

    public boolean tieenconstructor(){
        return tieneconstructor;
    }

    }



