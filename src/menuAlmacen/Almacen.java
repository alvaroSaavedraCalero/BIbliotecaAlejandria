package menuAlmacen;

import clasesAbstractasInterfaces.Documento;
import clasesAbstractasInterfaces.Persona;
import documentos.Articulo;
import documentos.Libro;
import documentos.Revista;
import personas.Bibliotecario;
import personas.Cliente;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Almacen {
    private ArrayList<Documento> almacenDocumentos;
    private ArrayList<Persona> almacenPersonas;

    public ArrayList<Documento> getAlmacenDocumentos() {
        return almacenDocumentos;
    }

    public void setAlmacenDocumentos(ArrayList<Documento> almacenDocumentos) {
        this.almacenDocumentos = almacenDocumentos;
    }

    public ArrayList<Persona> getAlmacenPersonas() {
        return almacenPersonas;
    }

    public void setAlmacenPersonas(ArrayList<Persona> almacenPersonas) {
        this.almacenPersonas = almacenPersonas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Almacen)) return false;
        Almacen almacen = (Almacen) o;
        return Objects.equals(getAlmacenDocumentos(), almacen.getAlmacenDocumentos()) && Objects.equals(getAlmacenPersonas(), almacen.getAlmacenPersonas());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAlmacenDocumentos(), getAlmacenPersonas());
    }

    @Override
    public String toString() {
        return "Almacen{" +
                "almacenDocumentos=" + almacenDocumentos +
                ", almacenPersonas=" + almacenPersonas +
                '}';
    }

    public Almacen(){
        this.almacenDocumentos = new ArrayList<>();
        this.almacenPersonas = new ArrayList<Persona>();

        this.almacenDocumentos.add(new Libro(1, "EL QUIJOTE", "MIGUEL DE CERVANTES", "ANAYA", 3, 1785, false, false, LocalDate.of(2015, 5, 21), null));
        this.almacenDocumentos.add(new Libro(2, "HARRY POTTER", "J.K. ROWLING", "PLANETA", 25, 4563, false, false, LocalDate.of(2016, 7, 26), null));
        this.almacenDocumentos.add(new Libro(3, "DIARIO DEL LADRON", "JEAN GENET", "RBALIBROS", 48, 542, true, false, LocalDate.of(2017, 9, 29), null));
        this.almacenDocumentos.add(new Libro(4, "29 MINUTO Y MEDIO", "ANA FRANCES", "PLANETA", 1, 210, false,false, LocalDate.of(2021, 11, 15), null));
        this.almacenDocumentos.add(new Libro(5, "LA DIPLOMACIA DEL ESTADO", "CARLOS MOLINA", "SIRUELA", 4, 178, false,false, LocalDate.of(2021, 11, 15), null));
        this.almacenDocumentos.add(new Libro(6, "ACASO HAYA ESQUINAS", "JUAN MANUEL DEL VALLE", "ANAYA", 2, 352, true,false, LocalDate.of(2019, 4, 22), null));
        this.almacenDocumentos.add(new Libro(7, "BROMENANDO CON MI PADRE", "SONIA SENDA CRESPO", "MALPASO", 7, 314, false, false, LocalDate.of(2010, 1, 5), null));
        this.almacenDocumentos.add(new Libro(8, "EL ULTIMO DE LOS GRISES", "JORGE GARCIA GARCIA", "TUSQUETS", 3, 320, false, false, LocalDate.of(2005, 7, 29), null));
        this.almacenDocumentos.add(new Libro(9, "EL FUTURO DEL LIBERALISMO", "ISA FERRERO", "SIRUELA", 8, 134, true,false, LocalDate.of(2011, 3, 5), null));
        this.almacenDocumentos.add(new Libro(10, "DE LA MUSICA, EL RUIDO Y EL SILENCIO EN LOS CINES", "MARCOS AZZAM GOMEZ", "ANAYA", 4, 350, false, false, LocalDate.of(2010, 8, 6), null));
        this.almacenDocumentos.add(new Libro(11, "LA ORQUIDIA AZUL", "CARMEN SANZ PRIETO", "MALPASO", 1, 244, false,false, LocalDate.of(2009, 2, 12), null));
        this.almacenDocumentos.add(new Revista(12, " EMERGENCIAS ", "JUAN ALFREDO PEREZ", "SOCIEDAD ESPAÑOLA DE MEDICINA", false, 37, false, LocalDate.of(2021, 1, 5), null));
        this.almacenDocumentos.add(new Revista(13, "NUTRICIÓN HOSPITALARIA ", "MARÍA ESCOLONA", "ALIANZA EDITORIAL", false, 21, false, LocalDate.of(2012, 4, 12), null));
        this.almacenDocumentos.add(new Revista(14, "HISTORIA SOCIAL ", "JULIO ESTRADA", "PLANETA COMIC", true, 73, false, LocalDate.of(2011, 2, 17), null));
        this.almacenDocumentos.add(new Revista(15, "AL-QANTARA", "ÁFRICA CABEZA", "ALIANZA EDITORIAL", false, 53, false, LocalDate.of(2008, 6, 27), null));
        this.almacenDocumentos.add(new Revista(16, "HISTORIA CONSTITUCIONAL", "LILIANA QUIROGA", "ASTIBERRI EDITORIAL ", false, 68, false, LocalDate.of(2001, 8, 29), null));
        this.almacenDocumentos.add(new Revista(17, "ANSIEDAD Y ESTRES", "VICTOR REBOLO", "ASTIBERRI EDITORIAL", false, 84, false, LocalDate.of(2021, 1, 5), null));
        this.almacenDocumentos.add(new Revista(18, "AMERIACA LATINA HOY", "ELISABET GALLEGO", "PLANETA COMIC", false, 53, false, LocalDate.of(2012, 4, 12), null));
        this.almacenDocumentos.add(new Revista(19, "HACIENDA PUBLICA ESPAÑA ", "INMACULADA CABRERO MATEO", "ALIANZA EDITORIAL", false, 28, false, LocalDate.of(2004, 6, 5), null));
        this.almacenDocumentos.add(new Articulo(3, "A REVIEW OF DEFINITION AND MEASURES OS SYSTEM RESILIENCE", "HOSSEINI", "RELIABILITY", false, false, LocalDate.of(2016, 10, 22), null));
        this.almacenDocumentos.add(new Articulo(4, "GLOBAL", "SANCHEZ-AVILA", "THE LANCET", false, false, LocalDate.of(2018, 6, 7), null));
        this.almacenDocumentos.add(new Articulo(5, "CORRUPCIÓN Y GOBIERNO", "ROSE-ACKERMAN", "SECOND EDITION", true, false, LocalDate.of(2016, 2, 18), null));
        this.almacenDocumentos.add(new Articulo(6, "CR-CREACIÓN", "ROSE-ACKERMAN", "SECOND EDITION", false, false, LocalDate.of(2018, 12, 10), null));
        this.almacenDocumentos.add(new Articulo(7, "SYNTHESIS", "TRUJILLO SANTIAGO", "BIOMATERIALS", false, false, LocalDate.of(2015, 8, 15), null));

        this.almacenPersonas.add(new Cliente("nombreCliente1", 25, "contraseña", "cliente", 1));
        this.almacenPersonas.add(new Cliente("nombreCliente2", 16, "contraseña", "cliente", 2));
        this.almacenPersonas.add(new Cliente("nombreCliente3", 50, "contraseña", "cliente", 3));
        this.almacenPersonas.add(new Cliente("nombreCliente4", 12, "contraseña", "cliente", 4));

        this.almacenPersonas.add(new Bibliotecario("nombreBiliotecario1", 40, "contraseña", "biliotecario", 1));
    }


}
