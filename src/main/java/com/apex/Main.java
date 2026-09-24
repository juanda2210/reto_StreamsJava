package com.apex;

import com.apex.models.Producto;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();

        productos.add(new Producto("Shampoo", "Aseo personal", 3900));
        productos.add(new Producto("Jabon", "Aseo personal", 2500));
        productos.add(new Producto("Cepillo", "Aseo personal", 4000));
        productos.add(new Producto("Pasta dental", "Aseo personal", 100000));

        List<Producto> productosPorCategoria = Producto.porCategoria(productos, "Aseo personal");

        Producto.mostrarProductos(productosPorCategoria, "Aseo personal");

    }
}
