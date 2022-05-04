package clasesAbstractasInterfaces;

import documentos.Articulo;
import documentos.Libro;
import documentos.Revista;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Funciones {

    private static final Scanner entrada = new Scanner(System.in);

    /**
     * @return
     */
    public static Integer pedirNumero() {
        Integer retorno = null;
        boolean continuar = true;
        while (continuar) {
            try {
                retorno = Integer.parseInt(entrada.nextLine());
                continuar = false;
            } catch (NumberFormatException error) {
                System.out.println("No ha escrito un numero.");
            }
        }
        return retorno;
    }

    public static Integer buscaPosicionDocumentosReservados(Integer id, ArrayList<Integer> documentosReservados) {
        int i = 0;
        boolean continuar = true;
        Integer retorno = null;
        while (continuar && documentosReservados.size() < i) {
            if (documentosReservados.get(i).equals(id)) {
                retorno = i;
                continuar = false;
            }
        }
        return retorno;
    }

    public static boolean existeIdPersonas(ArrayList<Persona> almacenPersonas, Integer id) {
        Iterator<Persona> iterator = almacenPersonas.iterator();
        Boolean retorno = false;
        while (iterator.hasNext()) {
            Persona persona = iterator.next();
            if (persona.getId().equals(id)) {
                retorno = true;
            }
        }
        return retorno;
    }

    public static boolean existeIdDocumentos(ArrayList<Documento> almacenDocumentos, Integer id) {
        Iterator<Documento> iterator = almacenDocumentos.iterator();
        Boolean retorno = false;
        while (iterator.hasNext()) {
            Documento documento = iterator.next();
            if (documento.getId().equals(id)) {
                retorno = true;
            }
        }
        return retorno;
    }

    public static boolean pideBooleano() {
        Boolean retorno = null, continuar = true;
        int respuesta;
        System.out.println("1.Verdadero");
        System.out.println("2. Falso");
        while (continuar) {
            respuesta = pedirNumero();
            if (respuesta == 1) {
                retorno = true;
                continuar = false;
            } else if (respuesta == 2) {
                retorno = false;
                continuar = false;
            } else {
                System.out.println("No ha escrito algo correcto");
            }
        }
        return retorno;
    }

    public static LocalDate pedirFecha() {
        LocalDate retorno = null;
        boolean continuar = true;
        Integer anio, mes, dia;
        while (continuar) {
            System.out.println("Ingrese el año: ");
            anio = pedirNumero();
            System.out.println("Ingrese el mes: ");
            mes = pedirNumero();
            System.out.println("Ingrese el dia: ");
            dia = pedirNumero();

            if (anio.toString().length() == 4 && (mes > 0 && mes < 12) && (dia > 0 && dia < 31)) {
                try {
                    retorno = LocalDate.of(anio, mes, dia);
                } catch (DateTimeException dateTimeException) {
                    dateTimeException.getMessage();
                } catch (ArithmeticException aritmetic) {
                    aritmetic.getMessage();
                }
                continuar = false;
            } else {
                System.out.println("No escribio datos correctos;");
            }
        }
        return retorno;
    }

    public static Integer pedirIdDocumentos(ArrayList<Documento> almacenDocumentos, Integer id){
        boolean continuar = true;
        Integer retorno = null;
        while (continuar) {
            System.out.println("¿Cual es el id que quiere?");
            id = pedirNumero();
            if (existeIdDocumentos(almacenDocumentos, id)) {
                System.out.println("Ese id ya existe, elija otro");
            } else {
                System.out.println("Su id es correcto");
                continuar = false;
            }
        }
        return retorno;
    }

    public static Libro crearLibro(ArrayList<Documento> almacenDocumentos) {
        System.out.println("Elije un id: ");
        Integer id = Funciones.pedirIdDocumentos(almacenDocumentos, Funciones.pedirNumero());
        System.out.println("¿Cual es el nombre del libro?");
        String nombre = entrada.nextLine().toUpperCase();
        System.out.println("¿Cual/es son los autores del libro?");
        String autores = entrada.nextLine().toUpperCase();
        System.out.println("¿Cual es la editorial del libro?");
        String editorial = entrada.nextLine().toUpperCase();
        System.out.println("¿Cual es la edicion del libro?");
        Integer edicion = Funciones.pedirNumero();
        System.out.println("¿Cuantas paginas tiene el libro?");
        Integer numPaginas = Funciones.pedirNumero();
        System.out.println("¿Es un libro de tematica sensible?");
        boolean tematicaSensible = Funciones.pideBooleano();
        boolean reservado = false;
        System.out.println("¿Cual fue la fecha de publicacion?");
        LocalDate fechaPublicacion = Funciones.pedirFecha();
        Persona personaReserva = null;

        return new Libro(id, nombre, autores, editorial, edicion, numPaginas, tematicaSensible, reservado, fechaPublicacion, personaReserva);
    }

    public static Articulo crearArticulo(ArrayList<Documento> almacenDocumentos) {
        System.out.println("Elije un id: ");
        Integer id = Funciones.pedirIdDocumentos(almacenDocumentos, Funciones.pedirNumero());
        System.out.println("¿Cual es el nombre del articulo?");
        String nombre = entrada.nextLine().toUpperCase();
        System.out.println("¿Cual/es son los autores del articulo?");
        String autores = entrada.nextLine().toUpperCase();
        System.out.println("¿Cual es la editorial del articulo?");
        String editorial = entrada.nextLine().toUpperCase();
        System.out.println("¿Es un articulo de tematica sensible?");
        boolean tematicaSensible = Funciones.pideBooleano();
        boolean reservado = false;
        System.out.println("¿Cual fue la fecha de publicacion?");
        LocalDate fechaPublicacion = Funciones.pedirFecha();
        Persona personaReserva = null;

        return new Articulo(id, nombre, autores, editorial, tematicaSensible, reservado, fechaPublicacion, personaReserva);
    }

    public static Revista crearRevista(ArrayList<Documento> almacenDocumentos) {
        System.out.println("Elije un id: ");
        Integer id = Funciones.pedirIdDocumentos(almacenDocumentos, Funciones.pedirNumero());
        System.out.println("¿Cual es el nombre del revista?");
        String nombre = entrada.nextLine().toUpperCase();
        System.out.println("¿Cual/es son los autores del revista?");
        String autores = entrada.nextLine().toUpperCase();
        System.out.println("¿Cual es la editorial del revista?");
        String editorial = entrada.nextLine().toUpperCase();
        System.out.println("¿Es un revista de tematica sensible?");
        boolean tematicaSensible = Funciones.pideBooleano();
        System.out.println("¿Cual es el numero de la revista?");
        Integer numRevista = Funciones.pedirNumero();
        boolean reservado = false;
        System.out.println("¿Cual fue la fecha de publicacion?");
        LocalDate fechaPublicacion = Funciones.pedirFecha();
        Persona personaReserva = null;

        return new Revista(id, nombre, autores, editorial, tematicaSensible, numRevista, reservado, fechaPublicacion, personaReserva);
    }
}
