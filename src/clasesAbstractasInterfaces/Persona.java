package clasesAbstractasInterfaces;

import java.util.Comparator;
import java.util.Objects;

/**
 * @author Álvaro Saavedra Calero
 * @see java.lang.Comparable
 * @see java.util.Comparator
 * @since 27/04/2022
 */
public abstract class Persona implements Comparable<Persona>, Comparator<Persona> {
    private String nombre;
    private int edad;
    private String password;
    private StringBuilder user;
    private String rol;
    private Integer id;

    /**
     * Constructor con todos los parametros
     *
     * @param nombre
     * @param edad
     * @param password
     * @param rol
     * @param id
     */
    public Persona(String nombre, int edad, String password, String rol, Integer id) {
        this.nombre = nombre;
        this.edad = edad;
        this.password = password;
        this.user = new StringBuilder(nombre.concat(id.toString()));
        this.rol = rol;
        this.id = id;
    }


    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public StringBuilder getUser() {
        return user;
    }

    public void setUser(StringBuilder user) {
        this.user = user;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona)) return false;
        Persona persona = (Persona) o;
        return getEdad() == persona.getEdad() && getNombre().equals(persona.getNombre()) && getPassword().equals(persona.getPassword()) && getUser().equals(persona.getUser()) && getRol().equals(persona.getRol()) && getId().equals(persona.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getEdad(), getPassword(), getUser(), getRol(), getId());
    }

    @Override
    public int compareTo(Persona o) {
        return this.id.compareTo(o.getId());
    }

    @Override
    public int compare(Persona o1, Persona o2) {
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
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", password='" + password + '\'' +
                ", user=" + user +
                ", rol='" + rol + '\'' +
                ", id=" + id +
                '}';
    }
}
