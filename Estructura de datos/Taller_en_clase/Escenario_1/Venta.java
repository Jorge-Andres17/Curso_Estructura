package Taller_en_clase.Escenario_1;

public class Venta {
    String codigo;
    String nombre;
    int cantidad;
    int total_venta;

    public Venta(String codigo, String nombre, int cantidad, int total_venta){
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.total_venta = total_venta;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getTotal_venta() {
        return total_venta;
    }

    public void setTotal_venta(int total_venta) {
        this.total_venta = total_venta;
    }

    @Override
    public String toString() {
        return "Venta [codigo=" + codigo + ", nombre=" + nombre + ", cantidad=" + cantidad + ", total_venta="
                + total_venta + "]";
    }

    
}
