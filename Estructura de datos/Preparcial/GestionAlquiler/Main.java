package Preparcial.GestionAlquiler;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Auto> autos = new ArrayList<>();
        autos.add(new Auto());
        autos.add(new Auto());

        List<Moto> motos = new ArrayList<>();
        motos.add(new Moto());
        motos.add(new Moto());

        List<Camion> camiones = new ArrayList<>();
        camiones.add(new Camion());

        System.out.println("Alquiler de autos:");
        SistemaAlquiler.alquilarVehiculos(autos);

        System.out.println("Alquiler de motos:");
        SistemaAlquiler.alquilarVehiculos(motos);

        System.out.println("Alquiler de camiones:");
        SistemaAlquiler.alquilarVehiculos(camiones);

    }

}
