package application.trabajoBiblioteca.documentos;

import application.trabajoBiblioteca.clasesAbstractasInterfaces.Documento;
import application.trabajoBiblioteca.clasesAbstractasInterfaces.InterfaceArticulo;
import application.trabajoBiblioteca.clasesAbstractasInterfaces.Persona;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Objects;

public class Articulo extends Documento implements InterfaceArticulo {
    private HashMap<Integer, String> criticas;

    /**
     * Constructor con los atricutos heredados y el propio
     * @param nombre
     * @param autores
     * @param editorial
     * @param tematicaSensible
     * @param reservado
     * @param id
     * @param fechaPublicacion
     * @param personaReserva
     */
    public Articulo(Integer id, String nombre, String autores, String editorial, boolean tematicaSensible, boolean reservado, LocalDate fechaPublicacion, Persona personaReserva) {
        super(nombre, autores, editorial, tematicaSensible, reservado, id, fechaPublicacion, personaReserva);
        this.criticas = new HashMap<>();
    }


    public Articulo(){
        this.criticas = new HashMap<>();
    }

    public HashMap<Integer, String> getCriticas() {
        return criticas;
    }

    public void setCriticas(HashMap<Integer, String> criticas) {
        this.criticas = criticas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Articulo)) return false;
        if (!super.equals(o)) return false;
        Articulo articulo = (Articulo) o;
        return getCriticas().equals(articulo.getCriticas());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getCriticas());
    }

    @Override
    public void visualizarTodasCriticas() {
        System.out.println(this.criticas);
    }

    @Override
    public void obtenerCritica(int numCritica) {
        System.out.println(this.criticas.get(numCritica));
    }

    @Override
    public void aniadirCritica(Integer idCritica, String critica) {
        this.criticas.put(idCritica, critica);
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "nombre='" + this.getNombre() + '\'' +
                ", autores='" + this.getAutores() + '\'' +
                ", editorial='" + this.getEditorial() + '\'' +
                ", tematicaSensible=" + this.getTematicaSensible() +
                ", reservado=" + this.getReservado() +
                ", id=" + this.getId() +
                ", fechaPublicacion=" + this.getFechaPublicacion() +
                ", personaReserva=" + this.getPersonaReserva() +
                "criticas=" + criticas +
                '}';
    }
}
