/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class Factura {
    private String descripcion;
    private int Total;
    private Cliente cliente;
    private Productos [] productos;

    public String getDescripcion() {
        return descripcion;
    }

    public Factura setDescripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }

    public int getTotal() {
        return Total;
    }

    public Factura setTotal(int Total) {
        this.Total = Total;
        return this;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Factura setCliente(Cliente cliente) {
        this.cliente = cliente;
        return this;
    }

    public Productos[] getProductos() {
        return productos;
    }

    public Factura setProductos(Productos[] productos) {
        this.productos = productos;
        return this;
    }
}
