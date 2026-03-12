package Preparcial.GestionAlquiler;

public class Moto extends Vehiculo {

    @Override
    public void alquilar(){
        System.out.println("Moto alquilada");
    }

    public void conducir(){
        System.out.println("La moto esta conduciendo");
    }

}