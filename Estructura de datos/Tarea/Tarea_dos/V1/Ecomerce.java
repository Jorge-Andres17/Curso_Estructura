package Tarea.Tarea_dos.V1;

public class Ecomerce {

    /* En la primera version se implementa una interface */
    public static void main(String[] args) {
        Producto producto1 = new Producto("PC gamer", 10000000);
        Producto producto2 = new Producto("SmartPhone", 1500000);
        Producto producto3 = new Producto("Televisor", 2000000);
        Producto producto4 = new Producto("Tarjeta Grafica", 3000000);

        Carrito<Producto> carrito = new Carrito<>();

        carrito.agregar(producto1);
        carrito.agregar(producto2);
        carrito.agregar(producto3);
        carrito.agregar(producto4);

        System.out.println(carrito);
        System.out.println("El producto con mayor precio es: " + carrito.obtenerProductoMayorPrecio());
        System.out.printf("El precio total es: %.2f", carrito.calcularPrecioTotal());
   
    }    
}