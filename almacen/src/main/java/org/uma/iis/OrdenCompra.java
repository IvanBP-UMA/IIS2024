package org.uma.iis;

public class OrdenCompra {

    private String articulo;
    private int cantidad;

    OrdenCompra (String articulo, int cantidad){
        this.articulo=articulo;
        this.cantidad=cantidad;
    }

    void efectuarCompra(IAlmacen almacen){
        almacen.eliminar(this.articulo, this.cantidad);
    }
}
