package org.uma.iis;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class TiendaTest{

    @Test
    public void ventaProductoTest() {
        // Inicializar
        IAlmacen almacen= Mockito.mock(IAlmacen.class);
        when (almacen.hayArticulos("Cerveza", 20)).thenReturn(true);

        // Ejecutar
        OrdenCompra orden = new OrdenCompra("Cerveza", 20) ;
        orden.efectuarCompra(almacen) ;

        // Comprobar
        verify(almacen).eliminar("Cerveza", 20);
    }
}