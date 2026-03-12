package Preparcial.GestionTareas;

import java.time.LocalDate;

public class Tarea {
    private String descripcion;
    private int prioridad;
    private LocalDate fechaVencimiento;

    public Tarea(String descripcion, int prioridad, LocalDate fechaVencimiento){
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public int getPrioridad(){
        return prioridad;
    }

    public LocalDate getFechaVencimiento(){
        return fechaVencimiento;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
    
    public void setFechaVencimiento(LocalDate fechaVencimiento){
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public String toString() {
        return "Tarea [descripcion=" + descripcion + ", prioridad=" + prioridad + ", fechaVencimiento="
                + fechaVencimiento + "]";
    }

    
}
