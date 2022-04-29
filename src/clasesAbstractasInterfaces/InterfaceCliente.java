package clasesAbstractasInterfaces;

import java.util.ArrayList;

public interface InterfaceCliente {
    void reservarDocumento(ArrayList<Documento> almacenDocumentos);
    void devolverDocumento(ArrayList<Documento> almacenDocumentos);
    void consultarDocumento(ArrayList<Documento> almacenDocumentos);
    void consultarTodosDocumentos(ArrayList<Documento> almacenDocumentos);
}
