
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
public class ManejadorPila {

    Stack stack = new Stack();

    public void AgregarPila(Factura factura) {
        stack.push(factura);
    }

    public void MostrarFactura() {
        while (!stack.empty()) {
            Factura factura = (Factura) stack.pop();
             System.out.println("#################################################################");
              System.out.println("Descripcion factura " + factura.getDescripcion());
            System.out.println("#################################################################");
            System.out.println("Datos del cliente");
            System.out.println("nombres: " + factura.getCliente().getNombres());
            System.out.println("apellidos: " + factura.getCliente().getApellidos());
            System.out.println("tipo Documento: " + factura.getCliente().getTipoDocumento());
            System.out.println("documento: " + factura.getCliente().getDocumento());
            System.out.println("#################################################################");
            System.out.println("Datos de los productos");
            Productos productos[] = factura.getProductos();
            for (Productos producto : productos) {
                System.out.println("#################################################################");
                System.out.println("producto: " + producto.getNombre());
                System.out.println("cantidad: " + producto.getCantidad());
                System.out.println("Precios: " + producto.getPrecio());
                System.out.println("#################################################################");
            }
        }
    }

}
