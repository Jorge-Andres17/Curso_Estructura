package Implementacion_Laboratorio.Escencario_4;

public class TestEcommerce {

    public static void main(String[] args) {

        Catalogo catalogo = new Catalogo();

        int n = 100000;

        long inicio = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {

            catalogo.agregarProducto(
                    new Producto(
                            "P" + i,
                            "Producto" + i,
                            Math.random() * 1000,
                            "Tecnologia"));
        }

        long fin = System.currentTimeMillis();

        System.out.println("Tiempo insertar: " + (fin - inicio));

        inicio = System.currentTimeMillis();

        catalogo.buscarProducto("P50000");

        fin = System.currentTimeMillis();

        System.out.println("Tiempo buscar: " + (fin - inicio));
    }
}