/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class Creador {
    public Cliente CrearCliente(String nombre,String apellido,String documento,String tipo){
        Cliente cliente=new Cliente()
                .setNombres(nombre)
                .setApellidos(apellido)
                .setDocumento(documento)
                .setTipoDocumento(tipo);
        return cliente;
    }
    
    public  Factura crearFactura(String descripcion,int total,Cliente clietne,Productos [] productos){
        Factura factura = new Factura()
                .setCliente(clietne)
                .setDescripcion(descripcion)
                .setTotal(total)
                .setProductos(productos);
        return factura;
    }
    
    public Productos crearProductos(String nombre,int cantidad,int precios){
        Productos producto = new Productos()
                .setNombre(nombre)
                .setCantidad(cantidad)
                .setPrecio(precios);
        return producto;
    }
}
