package Implementacion_Laboratorio.Escencario_4;

import java.util.*;

public class Catalogo {

    HashMap<String, Producto> mapaProductos = new HashMap<>();
    TreeSet<Producto> ordenPrecio = new TreeSet<>();
    ArrayList<Producto> lista = new ArrayList<>();

    public void agregarProducto(Producto p) {

        mapaProductos.put(p.codigo, p);
        ordenPrecio.add(p);
        lista.add(p);
    }

    public Producto buscarProducto(String codigo) {
        return mapaProductos.get(codigo);
    }

    public void mostrarOrdenados() {

        for(Producto p : ordenPrecio) {
            System.out.println(p.nombre + " - $" + p.precio);
        }
    }
}