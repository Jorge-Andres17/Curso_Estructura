package Implementacion_Laboratorio.Escencario_2;

class Producto implements Comparable<Producto> {

    String codigo;
    String nombre;
    double precio;
    String categoria;

    public Producto(String codigo, String nombre, double precio, String categoria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    @Override
    public int compareTo(Producto o) {
        return Double.compare(this.precio, o.precio);
    }
}
