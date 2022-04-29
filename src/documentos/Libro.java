package documentos;

import clasesAbstractasInterfaces.Documento;
import clasesAbstractasInterfaces.Persona;

import java.time.LocalDate;
import java.util.Objects;

public class Libro extends Documento {
    private Integer numPaginas;
    private Integer edicion;

    /**
     * Constructor con atributos heredados y propios
     * @param id Integer
     * @param nombre String
     * @param autores String
     * @param editorial String
     * @param edicion Integer
     * @param numPaginas Integer
     * @param tematicaSensible boolean
     * @param reservado boolean
     * @param fechaPublicacion LocalDate
     * @param personaReserva Persona
     */
    public Libro(Integer id, String nombre, String autores, String editorial,Integer edicion,Integer numPaginas, boolean tematicaSensible, boolean reservado, LocalDate fechaPublicacion, Persona personaReserva) {
        super(nombre, autores, editorial, tematicaSensible, reservado, id, fechaPublicacion, personaReserva);
        this.numPaginas = numPaginas;
        this.edicion = edicion;
    }

    /**
     * Constructor con atributos propios
     * @param numPaginas
     * @param edicion
     */
    public Libro(Integer numPaginas, Integer edicion) {
        this.numPaginas = numPaginas;
        this.edicion = edicion;
    }

    public Libro(){}

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    public Integer getEdicion() {
        return edicion;
    }

    public void setEdicion(Integer edicion) {
        this.edicion = edicion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Libro)) return false;
        if (!super.equals(o)) return false;
        Libro libro = (Libro) o;
        return Objects.equals(getNumPaginas(), libro.getNumPaginas()) && Objects.equals(getEdicion(), libro.getEdicion());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getNumPaginas(), getEdicion());
    }

    @Override
    public String toString() {
        return "Libro{" +
                "nombre='" + this.getNombre() + '\'' +
                ", autores='" + this.getAutores() + '\'' +
                ", editorial='" + this.getEditorial() + '\'' +
                ", tematicaSensible=" + this.getTematicaSensible() +
                ", reservado=" + this.getReservado() +
                ", id=" + this.getId() +
                ", fechaPublicacion=" + this.getFechaPublicacion() +
                ", personaReserva=" + this.getPersonaReserva() +
                "numPaginas=" + numPaginas +
                ", edicion=" + edicion +
                '}';
    }
}
