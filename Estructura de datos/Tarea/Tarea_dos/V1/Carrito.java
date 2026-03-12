package Tarea.Tarea_dos.V1;

import java.util.ArrayList;

public class Carrito<T extends precio> {

    ArrayList<T> lista = new ArrayList<>();

    public void agregar(T t) {
        lista.add(t);
    }

    public CarritoIterador<T> crearCarritoIterador() {
        return new CarritoIterador<>(lista);
    }

    public T obtenerProductoMayorPrecio() {
        CarritoIterador<T> it = crearCarritoIterador();
        T mayor = null;
        while (it.hasNext()) {
            T p = it.nexT();
            if (mayor == null || p.getPrecio() > mayor.getPrecio()) {
                mayor = p;
            }
        }
        return mayor;
    }

    public double calcularPrecioTotal() {
        double total = 0;
        CarritoIterador<T> it = crearCarritoIterador();
        while (it.hasNext()) {
            T p = it.nexT();
            total += p.getPrecio();
        }
        
        return total;
    }

    @Override
    public String toString() {
        return "Productos Agregados al carrito= " + lista ;
    }
}
