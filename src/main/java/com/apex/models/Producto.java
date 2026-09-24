package com.apex.models;

import java.util.Comparator;
import java.util.List;

public class Producto {
    private String nombre;
    private String categoria;
    private double precio;

    public Producto(String nombre, String categoria, double precio) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }


    public static List<Producto> porCategoria(List<Producto> productos, String categoria) {
        return productos.stream()
                .filter(producto -> producto.categoria.equalsIgnoreCase(categoria))
                .sorted(Comparator.comparingDouble(Producto::getPrecio).reversed())
                .toList();
    }

    public static void mostrarProductos(List<Producto> productos, String categoria) {
        System.out.println("\n--------------------------------------------------------------------");
        System.out.println("Productos ordenados descendentemente de la categoria " + categoria);
        System.out.println("-----------------------------------------------------------------------");
        productos.forEach(producto -> System.out.println("Nombre: " + producto.nombre + " \n " + "Precio: " + producto.precio + " \n " + "Categoria: " + producto.categoria + "\n"));
    }
}
