package Taller_en_clase.Escenario_1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Tienda {

    public static void main(String[] args) {
        /* Crear los mapas */
        HashMap<String, Venta> hashMap = new HashMap<>();
        LinkedHashMap<String, Venta> linkedHashMap = new LinkedHashMap<>();
        TreeMap<String, Venta> treeMap = new TreeMap<>();

        /* Crear ventas */
        Venta venta = new Venta("1", "Audifonos", 10, 5);
        Venta venta2 = new Venta("2", "Mouse", 4, 2);
        Venta venta3 = new Venta("3", "SmartPhone", 7, 3);
        Venta venta4 = new Venta("4", "PC", 9, 1);

        /* Añadir ventas a HashMap */
        registrar_ventas_hashMap(hashMap, venta4);
        registrar_ventas_hashMap(hashMap, venta);
        registrar_ventas_hashMap(hashMap, venta2);
        registrar_ventas_hashMap(hashMap, venta3);

        /* Añadir ventas a LinkedHashMap */
        registrar_ventas_linkedHashMap(linkedHashMap, venta4);
        registrar_ventas_linkedHashMap(linkedHashMap, venta);
        registrar_ventas_linkedHashMap(linkedHashMap, venta2);
        registrar_ventas_linkedHashMap(linkedHashMap, venta3);

        /* Añadir ventas a TreeMap */
        registrar_ventas_treeMap(treeMap, venta4);
        registrar_ventas_treeMap(treeMap, venta);
        registrar_ventas_treeMap(treeMap, venta2);
        registrar_ventas_treeMap(treeMap, venta3);

        /* Buscar venta por su codigo HashMap */
        System.out.println("Busqueda con HashMap codigo 1");
        buscar_venta_hashMap(hashMap, "1");
        System.out.println("Busqueda con HashMap codigo 3");
        buscar_venta_hashMap(hashMap, "3");

        /* Buscar venta por su codigo LinkedHashMap */
        System.out.println("Busqueda con LinkedHashMap codigo 2");
        buscar_venta_linkedHasMap(linkedHashMap, "2");
        System.out.println("Busqueda con LinkedHashMap codigo 1");
        buscar_venta_linkedHasMap(linkedHashMap, "1");

        /* Buscar venta por su codigo TreeMap */
        System.out.println("Busqueda con TreeMap codigo 4");
        buscar_venta_treeMap(treeMap, "4");
        System.out.println("Busqueda con LinkedHashMap codigo 0");
        buscar_venta_treeMap(treeMap, "0");

        /* Mostrar todas las Ventas HashMap */
        System.out.println("Todas las ventas con HashMap");
        mostrar_ventas_hashMap(hashMap);

        /* Mostrar todas las Ventas LinkedHashhMap */
        System.out.println("Todas las ventas con LinkedHashMap");
        mostrar_ventas_linkedHasMap(linkedHashMap);

        /* Mostrar todas las Ventas TreeMap */
        System.out.println("Todas las ventas con TreeMap");
        mostrar_ventas_treeMap(treeMap);

        /* Mostrar las Ventas ordenadas con HashMap */
        System.out.println("Todas las ventas ordenadas con HashMap");
        mostrarOrdenadasHashMap(hashMap);

        /* Mostrar las Ventas ordenadas con LinkedHashMap */
        System.out.println("Todas las ventas ordenadas con LinkedHashMap");
        mostrarOrdenadasLinkedHashMap(linkedHashMap);

        /* Mostrar las Ventas ordenadas con TreeMap */
        System.out.println("Todas las ventas ordenadas con TreeMap");
        mostrarOrdenadasTreeMap(treeMap);

        /* Mostrar las ventas por orden de inserccion HashMap */
        System.out.println("Todas las ventas por orden de inserccion HashMap");
        mostrar_ventas_hashMap(hashMap);

        /* Mostrar las ventas por orden de inserccion LinkedHashMap */
        System.out.println("Todas las ventas por orden de inserccion LinkedHashMap");
        mostrar_ventas_linkedHasMap(linkedHashMap);

        /* Mostrar las ventas por orden de inserccion TreeMap */
        System.out.println("Todas las ventas por orden de inserccion TreeMap");
        mostrar_ventas_treeMap(treeMap);
    }

    private static void registrar_ventas_hashMap(HashMap<String, Venta> hashMap, Venta venta) {
        hashMap.put(venta.getCodigo(), venta);
    }

    private static void registrar_ventas_linkedHashMap(LinkedHashMap<String, Venta> linkedHashMap, Venta venta) {
        linkedHashMap.put(venta.getCodigo(), venta);
    }

    private static void registrar_ventas_treeMap(TreeMap<String, Venta> treeMap, Venta venta) {
        treeMap.put(venta.getCodigo(), venta);
    }

    private static void buscar_venta_hashMap(HashMap<String, Venta> hashMap, String codigo) {
        Venta venta = hashMap.get(codigo);

        if (venta != null) {
            System.out.println("Codigo: " + codigo + "->" + "Venta: " + venta);
        } else {
            System.out.println("No se encontro el producto");
        }
    }

    private static void buscar_venta_linkedHasMap(LinkedHashMap<String, Venta> linkedHashMap, String codigo) {
        Venta venta = linkedHashMap.get(codigo);

        if (venta != null) {
            System.out.println("Codigo: " + codigo + "->" + "Venta: " + venta);
        } else {
            System.out.println("No se encontro el producto");
        }
    }

    private static void buscar_venta_treeMap(TreeMap<String, Venta> treeMap, String codigo) {
        Venta venta = treeMap.get(codigo);

        if (venta != null) {
            System.out.println("Codigo: " + codigo + "->" + "Venta: " + venta);
        } else {
            System.out.println("No se encontro el producto");
        }
    }

    private static void mostrar_ventas_hashMap(HashMap<String, Venta> hashMap) {
        Iterator<Map.Entry<String, Venta>> it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Venta> ventaIt = it.next();
            System.out.println("Codigo: " + ventaIt.getKey() + "->" + "Venta: " + ventaIt.getValue());
        }
    }

    private static void mostrar_ventas_linkedHasMap(LinkedHashMap<String, Venta> linkedHashMap) {
        Iterator<Map.Entry<String, Venta>> it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Venta> ventaIt = it.next();
            System.out.println("Codigo: " + ventaIt.getKey() + "->" + "Venta: " + ventaIt.getValue());
        }
    }

    private static void mostrar_ventas_treeMap(TreeMap<String, Venta> treeMap) {
        Iterator<Map.Entry<String, Venta>> it = treeMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Venta> ventaIt = it.next();
            System.out.println("Codigo: " + ventaIt.getKey() + "->" + "Venta: " + ventaIt.getValue());
        }
    }

    private static void mostrarOrdenadasHashMap(HashMap<String, Venta> ventas) {
        TreeMap<String, Venta> ordenadas = new TreeMap<>(ventas);
        Iterator<Map.Entry<String, Venta>> it = ordenadas.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Venta> ventaIt = it.next();
            System.out.println("Codigo: " + ventaIt.getKey() + "->" + "Venta: " + ventaIt.getValue());
        }
    }

    private static void mostrarOrdenadasLinkedHashMap(LinkedHashMap<String, Venta> ventas) {
        TreeMap<String, Venta> ordenadas = new TreeMap<>(ventas);
        Iterator<Map.Entry<String, Venta>> it = ordenadas.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Venta> ventaIt = it.next();
            System.out.println("Codigo: " + ventaIt.getKey() + "->" + "Venta: " + ventaIt.getValue());
        }
    }

    private static void mostrarOrdenadasTreeMap(TreeMap<String, Venta> ventas) {
        Iterator<Map.Entry<String, Venta>> it = ventas.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Venta> ventaIt = it.next();
            System.out.println("Codigo: " + ventaIt.getKey() + "->" + "Venta: " + ventaIt.getValue());
        }
    }
}