package Implementacion_Laboratorio.Escencario_2;

import java.util.*;

public class SistemaVentas {

    HashMap<String, Producto> productos = new HashMap<>();
    LinkedList<Producto> listaInicio = new LinkedList<>();
    TreeSet<Producto> ordenPrecio = new TreeSet<>();
    HashMap<String, List<Producto>> categorias = new HashMap<>();

    public void agregarProducto(Producto p) {

        productos.put(p.codigo, p);

        listaInicio.addFirst(p);

        ordenPrecio.add(p);

        categorias
            .computeIfAbsent(p.categoria, k -> new ArrayList<>())
            .add(p);
    }

    public Producto buscarProducto(String codigo) {
        return productos.get(codigo);
    }

    public List<Producto> filtrarCategoria(String categoria) {
        return categorias.get(categoria);
    }
}
