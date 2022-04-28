package application.trabajoBiblioteca.personas;

import application.trabajoBiblioteca.clasesAbstractasInterfaces.Documento;
import application.trabajoBiblioteca.clasesAbstractasInterfaces.Funciones;
import application.trabajoBiblioteca.clasesAbstractasInterfaces.InterfaceCliente;
import application.trabajoBiblioteca.clasesAbstractasInterfaces.Persona;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

public class Cliente extends Persona implements InterfaceCliente {

    private static final Scanner entrada = new Scanner(System.in);
    private ArrayList<Integer> documentosReservados;

    /**
     * Constructor con todos los parametros
     *
     * @param nombre
     * @param edad
     * @param password
     * @param rol
     * @param id
     */
    public Cliente(String nombre, int edad, String password, String rol, Integer id) {
        super(nombre, edad, password, rol, id);
        this.documentosReservados = new ArrayList<>();
    }

    public Cliente() {
    }

    public ArrayList<Integer> getDocumentosReservados() {
        return documentosReservados;
    }

    public void setDocumentosReservados(ArrayList<Integer> documentosReservados) {
        this.documentosReservados = new ArrayList<>(documentosReservados);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente)) return false;
        if (!super.equals(o)) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(getDocumentosReservados(), cliente.getDocumentosReservados());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getDocumentosReservados());
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + this.getNombre() + '\'' +
                ", edad=" + this.getEdad() +
                ", password='" + this.getPassword() + '\'' +
                ", user=" + this.getUser() +
                ", rol='" + this.getRol() + '\'' +
                ", id=" + this.getId() +
                '}';
    }

    @Override
    public void reservarDocumento(ArrayList<Documento> almacenDocumentos) {
        Iterator<Documento> iterator = almacenDocumentos.iterator();
        boolean continuar = true;
        while (continuar) {
            System.out.println("¿Por que campo quiere buscar el documento que quiere reservar?");
            System.out.println("1. Nombre");
            System.out.println("2. Id");
            System.out.println("3. Editorial");
            Integer respuesta = Funciones.pedirNumero();
            switch (respuesta) {
                case 1:
                    System.out.println("Cual es el nombre del Documento?");
                    String nombre = entrada.nextLine().toUpperCase();
                    boolean continuar1 = true;
                    while (iterator.hasNext() && continuar1) {
                        Documento doc = iterator.next();
                        if (doc.getNombre().equals(nombre)) {
                            doc.setReservado(true);
                            this.documentosReservados.add(doc.getId());
                            System.out.println("Documento reservado correctamente");
                            continuar1 = false;
                        }
                        if (iterator.hasNext() == false) {
                            System.out.println("No se ha encontrado ningun Documento con ese nombre");
                        }
                    }
                    continuar = false;
                    break;

                case 2:
                    System.out.println("Cual es el Id del Documento?");
                    Integer id = Funciones.pedirNumero();
                    boolean continuar2 = true;
                    while (iterator.hasNext() && continuar2) {
                        Documento doc = iterator.next();
                        if (doc.getId().equals(id)) {
                            doc.setReservado(true);
                            this.documentosReservados.add(doc.getId());
                            System.out.println("Documento reservado correctamente");
                            continuar2 = false;
                        }
                        if (iterator.hasNext() == false) {
                            System.out.println("No se ha encontrado ningun Documento con ese Id");
                        }
                    }
                    continuar = false;
                    break;

                case 3:
                    System.out.println("Cual es la Editorial del Documento?");
                    String editorial = entrada.nextLine().toUpperCase();
                    boolean continuar3 = true;
                    while (iterator.hasNext() && continuar3) {
                        Documento doc = iterator.next();
                        if (doc.getEditorial().equals(editorial)) {
                            doc.setReservado(true);
                            this.documentosReservados.add(doc.getId());
                            System.out.println("Documento reservado correctamente");
                            continuar3 = false;
                        }
                        if (iterator.hasNext() == false) {
                            System.out.println("No se ha encontrado ningun Documento con ese Id");
                        }
                    }
                    continuar = false;
                    break;

                default:
                    System.out.println("No ha escrito un numero correcto.");
            }


        }
    }

    @Override
    public void devolverDocumento(ArrayList<Documento> almacenDocumentos) {
        Iterator<Documento> iterator = almacenDocumentos.iterator();
        boolean continuar = true;
        while (continuar) {
            System.out.println("¿Por que campo quiere buscar el documento que quiere devolver?");
            System.out.println("1. Nombre");
            System.out.println("2. Id");
            System.out.println("3. Editorial");
            Integer respuesta = Funciones.pedirNumero();
            switch (respuesta) {
                case 1:
                    System.out.println("Cual es el nombre del Documento?");
                    String nombre = entrada.nextLine().toUpperCase();
                    boolean continuar1 = true;
                    while (iterator.hasNext() && continuar1) {
                        Documento doc = iterator.next();
                        if (doc.getNombre().equals(nombre)) {
                            doc.setReservado(false);
                            this.documentosReservados.remove(Funciones.buscaPosicionDocumentosReservados(doc.getId(), this.documentosReservados));
                            System.out.println("Documento devuelto correctamente");
                            continuar1 = false;
                        }
                        if (iterator.hasNext() == false) {
                            System.out.println("No se ha encontrado ningun Documento con ese nombre");
                        }
                    }
                    continuar = false;
                    break;

                case 2:
                    System.out.println("Cual es el Id del Documento?");
                    Integer id = Funciones.pedirNumero();
                    boolean continuar2 = true;
                    while (iterator.hasNext() && continuar2) {
                        Documento doc = iterator.next();
                        if (doc.getId().equals(id)) {
                            doc.setReservado(false);
                            this.documentosReservados.remove(Funciones.buscaPosicionDocumentosReservados(doc.getId(), this.documentosReservados));
                            System.out.println("Documento devuelto correctamente");
                            continuar2 = false;
                        }
                        if (iterator.hasNext() == false) {
                            System.out.println("No se ha encontrado ningun Documento con ese Id");
                        }
                    }
                    continuar = false;
                    break;

                case 3:
                    System.out.println("Cual es la Editorial del Documento?");
                    String editorial = entrada.nextLine().toUpperCase();
                    boolean continuar3 = true;
                    while (iterator.hasNext() && continuar3) {
                        Documento doc = iterator.next();
                        if (doc.getEditorial().equals(editorial)) {
                            doc.setReservado(false);
                            this.documentosReservados.remove(Funciones.buscaPosicionDocumentosReservados(doc.getId(), this.documentosReservados));
                            System.out.println("Documento devuelto correctamente");
                            continuar3 = false;
                        }
                        if (iterator.hasNext() == false) {
                            System.out.println("No se ha encontrado ningun Documento con ese Id");
                        }
                    }
                    continuar = false;
                    break;

                default:
                    System.out.println("No ha escrito un numero correcto.");
            }


        }
    }

    @Override
    public void consultarDocumento(ArrayList<Documento> almacenDocumentos) {

    }

    @Override
    public void consultarTodosDocumentos(ArrayList<Documento> almacenDocumentos) {

    }
}
