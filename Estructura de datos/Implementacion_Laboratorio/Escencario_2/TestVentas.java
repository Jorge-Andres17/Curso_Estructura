package Implementacion_Laboratorio.Escencario_2;

public class TestVentas {

    public static void main(String[] args) {

        SistemaVentas sistema = new SistemaVentas();

        int n = 100000;

        long inicio = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {

            sistema.agregarProducto(
                    new Producto(
                            "COD" + i,
                            "Producto" + i,
                            Math.random() * 1000,
                            "Tecnologia"));
        }

        long fin = System.currentTimeMillis();

        System.out.println("Tiempo de inserción: " + (fin - inicio) + " ms");

        inicio = System.currentTimeMillis();

        Producto p = sistema.buscarProducto("COD50000");

        fin = System.currentTimeMillis();

        System.out.println("Tiempo de búsqueda: " + (fin - inicio) + " ms");

        System.out.println("Producto encontrado: " + p.nombre);

        inicio = System.currentTimeMillis();

        var lista = sistema.filtrarCategoria("Tecnologia");

        fin = System.currentTimeMillis();

        System.out.println("Tiempo filtrar categoría: " + (fin - inicio) + " ms");
        System.out.println("Cantidad productos categoría: " + lista.size());
    }
}