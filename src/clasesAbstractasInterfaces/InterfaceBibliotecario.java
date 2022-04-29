package clasesAbstractasInterfaces;


import java.util.ArrayList;

public interface InterfaceBibliotecario {
    void darAltaCliente(ArrayList<Persona> almacenPersonas);
    void darBajaCliente(ArrayList<Persona> almacenPersonas);
    void consultarCliente(ArrayList<Persona> almacenPersonas);
    void consultarTodosClientes(ArrayList<Persona> almacenPersonas);
    void darAltaDocumento(ArrayList<Documento> almacenDocumentos);
    void darBajaDocumento(ArrayList<Documento> almacenDocumentos);
}
