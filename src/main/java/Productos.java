/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class Productos {
    private String nombre;
    private int cantidad;
    private int precio;

    public String getNombre() {
        return nombre;
    }

    public Productos setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Productos setCantidad(int cantidad) {
        this.cantidad = cantidad;
        return this;
    }

    public int getPrecio() {
        return precio;
    }

    public Productos setPrecio(int precio) {
        this.precio = precio;
        return this;
    }    
}