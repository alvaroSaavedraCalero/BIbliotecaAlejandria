package application.trabajoBiblioteca.personas;

import application.trabajoBiblioteca.clasesAbstractasInterfaces.Documento;
import application.trabajoBiblioteca.clasesAbstractasInterfaces.Funciones;
import application.trabajoBiblioteca.clasesAbstractasInterfaces.InterfaceBibliotecario;
import application.trabajoBiblioteca.clasesAbstractasInterfaces.Persona;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Bibliotecario extends Cliente implements InterfaceBibliotecario {

    private static final Scanner entrada = new Scanner(System.in);
    private ArrayList<Integer> documentosReservados;
    /**
     * Constructor con todos los parametro, heredado en este caso.
     * @param nombre
     * @param edad
     * @param password
     * @param rol
     * @param id
     */
    public Bibliotecario(String nombre, int edad, String password, String rol, Integer id) {
        super(nombre, edad, password, rol, id);
        this.documentosReservados = new ArrayList<>();
    }

    public Bibliotecario() {
    }

    public ArrayList<Integer> getDocumentosReservados() {
        return documentosReservados;
    }

    public void setDocumentosReservados(ArrayList<Integer> documentosReservados) {
        this.documentosReservados = new ArrayList<>(documentosReservados);
    }

    @Override
    public void darAltaCliente(ArrayList<Persona> almacenPersonas) {
        System.out.println("¿Cual es el nombre del nuevo Cliente?");
        String nombreCliente = entrada.nextLine();
        System.out.println("¿Que edad tiene el nuevo Cliente?");
        Integer edadCliente = Funciones.pedirNumero();
        System.out.println("¿Cual es la contraseña del nuevo Cliente?");
        String passCliente = entrada.nextLine();
        String userCliente = entrada.nextLine();
        Integer idCliente = null;
        boolean continuar = true;


        Cliente nuevoCliente = new Cliente(
                nombreCliente,
                edadCliente,
                passCliente,
                userCliente,
                idCliente
                );
        almacenPersonas.add(nuevoCliente);

    }

    @Override
    public void darBajaCliente(ArrayList<Persona> almacenPersonas) {

    }

    @Override
    public void consultarCliente(ArrayList<Persona> almacenPersonas) {

    }

    @Override
    public void comprobarDocumento(ArrayList<Documento> almacenDocumentos) {

    }

    @Override
    public void darAltaDocumento(ArrayList<Documento> almacenDocumentos) {

    }

    @Override
    public void darBajaDocumento(ArrayList<Documento> almacenDocumentos) {

    }

    @Override
    public String toString() {
        return "Biliotecario{" +
                "nombre='" + this.getNombre() + '\'' +
                ", edad=" + this.getEdad() +
                ", password='" + this.getPassword() + '\'' +
                ", user=" + this.getUser() +
                ", rol='" + this.getRol() + '\'' +
                ", id=" + this.getId() +
                '}';
    }
}
