package Preparcial.GestionAlquiler;

public class Camion extends Vehiculo {

    @Override
    public void alquilar(){
        System.out.println("Camion alquilado");
    }

    public void cargar(){
        System.out.println("El camion esta cargando");
    }

}
