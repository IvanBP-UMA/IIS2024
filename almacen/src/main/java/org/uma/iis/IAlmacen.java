package org.uma.iis;

public interface IAlmacen {
    void eliminar(String articulo, int cantidad);
    boolean hayArticulos(String articulo, int cantidad);
}
