package Tarea.Tarea_dos.V2;

import java.util.ArrayList;

public class CarritoIterador<T> {
    ArrayList<T> lista = new ArrayList<>();
    int posicion = 0;

    public CarritoIterador(ArrayList<T> lista){
        this.lista = lista;
    }

    public boolean hasNext(){
        return posicion < lista.size();
    }

    public T next(){
        T t = lista.get(posicion);
        posicion++;
        return t;
    }
}
