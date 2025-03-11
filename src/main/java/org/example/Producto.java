package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Producto {
    Scanner teclado = new Scanner(System.in);
    //atributos
    private String codigo;
    private String nombre;
    private int precio;
    private int stock;

    //contructor vacío

    public Producto() {
    }

    //contructor

    public Producto(String codigo, String nombre, int precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    //getters y setters

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    //toString

    @Override
    public String toString() {
        return "Producto{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }

    // Métodos :)


    public void venderProducto(){
        int venta;
        System.out.println("Ingrese la cantidad a vender: ");
        venta = teclado.nextInt();
        if (venta>this.stock){
            System.out.println("Stock Insuficiente");
        } else {
            this.stock-=venta;
            System.out.println("Venta Exitosa :)");
        }
    }

    public void reponerStock(){
        int repocision;
        System.out.print("Ingrese la cantidad a reponer: ");
        repocision= teclado.nextInt();
        this.stock+=repocision;
    }

    public double aplicarDescuento(){
        precio*=0.98;
        System.out.println("Descuento aplicado");
        return precio;
    }

    public double aumentarPrecio(){
        precio*=1.06;
        System.out.println("Precio Aumentado");
        return precio;
    }

    public int valorTotal(){
        System.out.print("Total en inventario: "+stock);
        return precio*stock;
    }

    public void eliminarProducto(Producto listaProductos){
        System.out.println("Digite el codigo del producto a eliminar: ");
        String codigo = teclado.nextLine();
        if (codigo.equals(listaProductos.getCodigo())){
            listaProductos=null;
            System.out.println("Producto eliminado");
        } else {
            System.out.println("Producto no encontrado");
        }
    }
}