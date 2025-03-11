package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Juan David Ramírez Santana
// Quiz hecho 100% con inteligencia artesanal :)
public class Main {
    public static void main(String[] args) {
        List<Producto> listaProductos = new ArrayList<Producto>();
        Scanner teclado = new Scanner(System.in);
        int opcion;

        Producto producto1;


        do {
            for (Producto producto : listaProductos) {
                System.out.println("Codigo: " + producto.getCodigo());
                System.out.println("Nombre: " + producto.getNombre());
                System.out.println("Precio: " + producto.getPrecio());
                System.out.println("Stock: " + producto.getStock());
                System.out.println();
            }

            System.out.println("1. Crear Producto.");
            System.out.println("2. Vender Producto.");
            System.out.println("3. Reponer Stock.");
            System.out.println("4. Aplicar Descuento.");
            System.out.println("5. Aumentar Precio.");
            System.out.println("6. Calcular Valor Total");
            System.out.println("7. Eliminar un producto.");
            System.out.println("8. Salir.");
            System.out.print("Digite una opción: ");
            opcion=teclado.nextInt();
            switch (opcion){
                case 1:
                    // crear producto
                    System.out.print("Digite el codigo del producto: ");
                    String codigo = teclado.next();
                    System.out.print("Digite el nombre del producto: ");
                    String nombre = teclado.next();
                    System.out.print("Digite el precio del producto: $");
                    int precio = teclado.nextInt();
                    System.out.print("Digite el stock inicial: ");
                    int stock = teclado.nextInt();
                    listaProductos.add(new Producto(codigo, nombre, precio, stock));
                    break;
                case 2:

                    producto1.venderProducto();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:

                    break;
                case 8:
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion!=8);
    }
}