
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class Principal {
    public static void main(String args[]){
        Creador creador = new Creador();
        Cliente cliente1=creador.CrearCliente("juan", "diaz", "1048384823", "C.C");
        Cliente cliente2=creador.CrearCliente("jose", "perez", "10483333823", "C.C");
        Cliente cliente3=creador.CrearCliente("maria", "mendez", "104833284823", "C.C");
        Productos productos1= creador.crearProductos("camisa", 15,13000 );
        Productos productos2= creador.crearProductos("tv", 15,13000 );
        Productos productos3= creador.crearProductos("balon", 15,13000 );
        Productos productos[] = new Productos[5];
        productos[0]=productos1;
        productos[1]=productos2;
        productos[2]=productos3;
        Factura factura1 = creador.crearFactura("fact1", 200000, cliente1, productos);
        Factura factura2 = creador.crearFactura("fact2", 200000, cliente2, productos);
        Factura factura3 = creador.crearFactura("fact3", 200000, cliente3, productos);
        ManejadorPila manejador = new  ManejadorPila();
        manejador.AgregarPila(factura1);
        manejador.AgregarPila(factura2);
        manejador.AgregarPila(factura3);
        manejador.MostrarFactura();       
    }
}