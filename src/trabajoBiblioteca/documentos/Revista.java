package application.trabajoBiblioteca.documentos;

import application.trabajoBiblioteca.clasesAbstractasInterfaces.Documento;
import application.trabajoBiblioteca.clasesAbstractasInterfaces.Persona;

import java.time.LocalDate;
import java.util.Objects;

public class Revista extends Documento {
    private Integer numRevista;

    /**
     * Construtor con los atributos heredados y propios
     * @param nombre
     * @param autores
     * @param editorial
     * @param tematicaSensible
     * @param reservado
     * @param id
     * @param fechaPublicacion
     * @param personaReserva
     * @param numRevista
     */
    public Revista(Integer id, String nombre, String autores, String editorial, boolean tematicaSensible, Integer numRevista, boolean reservado, LocalDate fechaPublicacion, Persona personaReserva) {
        super(nombre, autores, editorial, tematicaSensible, reservado, id, fechaPublicacion, personaReserva);
        this.numRevista = numRevista;
    }

    /**
     * Constructor con los atributos propios
     * @param numRevista
     */
    public Revista(Integer numRevista) {
        this.numRevista = numRevista;
    }

    public Integer getNumRevista() {
        return numRevista;
    }

    public void setNumRevista(Integer numRevista) {
        this.numRevista = numRevista;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Revista)) return false;
        if (!super.equals(o)) return false;
        Revista revista = (Revista) o;
        return Objects.equals(getNumRevista(), revista.getNumRevista());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getNumRevista());
    }

    @Override
    public String toString() {
        return "Revista{" +
                "nombre='" + this.getNombre() + '\'' +
                ", autores='" + this.getAutores() + '\'' +
                ", editorial='" + this.getEditorial() + '\'' +
                ", tematicaSensible=" + this.getTematicaSensible() +
                ", reservado=" + this.getReservado() +
                ", id=" + this.getId() +
                ", fechaPublicacion=" + this.getFechaPublicacion() +
                ", personaReserva=" + this.getPersonaReserva() +
                "numRevista=" + numRevista +
                '}';
    }
}
