package Tarea.Tarea_dos.V1;

import java.util.ArrayList;

public class CarritoIterador<T> {
    ArrayList<T> t;
    int posicion = 0;

    public CarritoIterador(ArrayList<T> t){
        this.t = t;
    }

    public boolean hasNext(){
        return posicion < t.size();
    }

    public T nexT(){
        T element = t.get(posicion);
        posicion++;
        return element;
    }
}
