package application.trabajoBiblioteca.clasesAbstractasInterfaces;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Objects;

public abstract class Documento implements Comparable<Documento>, Comparator<Documento> {
    private String nombre;
    private String autores;
    private String editorial;
    private boolean tematicaSensible;
    private boolean reservado;
    private Integer id;
    private LocalDate fechaPublicacion;
    private Persona personaReserva;

    /**
     * Constructor con todos los parametros
     *
     * @param nombre
     * @param autores
     * @param editorial
     * @param tematicaSensible
     * @param reservado
     * @param id
     * @param fechaPublicacion
     * @param personaReserva
     */
    public Documento(String nombre, String autores, String editorial, boolean tematicaSensible, boolean reservado, Integer id, LocalDate fechaPublicacion, Persona personaReserva) {
        this.nombre = nombre;
        this.autores = autores;
        this.editorial = editorial;
        this.tematicaSensible = tematicaSensible;
        this.reservado = reservado;
        this.id = id;
        this.fechaPublicacion = fechaPublicacion;
        this.personaReserva = personaReserva;
    }

    public Documento() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public boolean getTematicaSensible() {
        return tematicaSensible;
    }

    public void setTematicaSensible(boolean tematicaSensible) {
        this.tematicaSensible = tematicaSensible;
    }

    public boolean getReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public Persona getPersonaReserva() {
        return personaReserva;
    }

    public void setPersonaReserva(Persona personaReserva) {
        this.personaReserva = personaReserva;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Documento)) return false;
        Documento documento = (Documento) o;
        return getTematicaSensible() == documento.getTematicaSensible() && getReservado() == documento.getReservado() && getNombre().equals(documento.getNombre()) && Objects.equals(getAutores(), documento.getAutores()) && Objects.equals(getEditorial(), documento.getEditorial()) && getId().equals(documento.getId()) && Objects.equals(getFechaPublicacion(), documento.getFechaPublicacion()) && Objects.equals(getPersonaReserva(), documento.getPersonaReserva());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getAutores(), getEditorial(), getTematicaSensible(), getReservado(), getId(), getFechaPublicacion(), getPersonaReserva());
    }

    @Override
    public int compareTo(Documento o) {
        return this.id.compareTo(o.getId());
    }

    @Override
    public int compare(Documento o1, Documento o2) {
        if (o1.compareTo(o2) > 0) {
            return 1;
        } else if (o1.compareTo(o2) < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Documento{" +
                "nombre='" + nombre + '\'' +
                ", autores='" + autores + '\'' +
                ", editorial='" + editorial + '\'' +
                ", tematicaSensible=" + tematicaSensible +
                ", reservado=" + reservado +
                ", id=" + id +
                ", fechaPublicacion=" + fechaPublicacion +
                ", personaReserva=" + personaReserva +
                '}';
    }
}
