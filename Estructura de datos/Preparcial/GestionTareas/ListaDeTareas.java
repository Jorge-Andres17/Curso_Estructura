package Preparcial.GestionTareas;

import java.util.ArrayList;

public class ListaDeTareas<T extends Tarea> {
    ArrayList<T> listaDeTareas = new ArrayList<>();
    
    public void agregarTareas(T t){
        listaDeTareas.add(t);
    }
   
    public ArrayList<T> obtenerTareasPorPrioridad(int prioridad){
        ArrayList<T> mayorPrioridad = new ArrayList<>();        
        
        for (T t : listaDeTareas) {
            if (t.getPrioridad() == prioridad) {
                mayorPrioridad.add(t);
            }
        }

        return mayorPrioridad;
    }

    public ArrayList<T> TareasOrdenadasFechaVencimiento(){
        ArrayList<T> listaOrdenada = new ArrayList<>(listaDeTareas);

        listaOrdenada.sort((t1,t2) -> t1.getFechaVencimiento().compareTo(t2.getFechaVencimiento()));

        return listaOrdenada;
     }

}
