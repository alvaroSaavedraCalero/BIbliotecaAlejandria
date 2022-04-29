package application.trabajoBiblioteca.clasesAbstractasInterfaces;


import java.util.ArrayList;

public interface InterfaceBibliotecario {
    void darAltaCliente(ArrayList<Persona> almacenPersonas);
    void darBajaCliente(ArrayList<Persona> almacenPersonas);
    void consultarCliente(ArrayList<Persona> almacenPersonas);
    void comprobarDocumento(ArrayList<Documento> almacenDocumentos);
    void darAltaDocumento(ArrayList<Documento> almacenDocumentos);
    void darBajaDocumento(ArrayList<Documento> almacenDocumentos);
}
