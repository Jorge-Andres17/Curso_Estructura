package Preparcial.GestionAlquiler;
import java.util.List;

public class SistemaAlquiler {

    public static void alquilarVehiculos(List<? extends Vehiculo> lista){

        for(Vehiculo v : lista){
            v.alquilar();
        }

    }

}
