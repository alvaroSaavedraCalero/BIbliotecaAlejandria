package application.trabajoBiblioteca.clasesAbstractasInterfaces;

import java.util.ArrayList;

public interface InterfaceCliente {
    boolean reservarDocumento(ArrayList<Documento> almacenDocumentos);
    boolean devolverDocumento(ArrayList<Documento> almacenDocumentos);
    void consultarDocumento(ArrayList<Documento> almacenDocumentos);
    void consultarTodosDocumentos(ArrayList<Documento> almacenDocumentos);
}
