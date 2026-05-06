package Preparcial_2;

import java.util.LinkedList;
import java.util.Queue;

public class Punto_3 {
    public static Queue agregarEnXPosicion(int posicion, Queue<Integer> cola, int valor){
        Queue<Integer> aux = new LinkedList<>();
        int posicionInterna = 0;

        if(posicion > posicionInterna){
            System.out.println("No puede agregar el numero " + valor + " en la posicion " + posicion + " Debido al desbordamiento que crea");
            return null;
        }
        while(!cola.isEmpty()){
            if(posicionInterna == posicion){
                aux.add(valor);
                posicionInterna++;
            }else {
                aux.add(cola.remove());
                posicionInterna++;
            }
        }
        if(posicionInterna == posicion){
            aux.add(valor);
        }

        return aux;
    }

    public static void main(String[] args) {
        Queue<Integer> cola = new LinkedList<>();
        cola.add(10);
        cola.add(20);
        cola.add(30);
        cola.add(40);

        if (agregarEnXPosicion(5, cola, 99) == null) {
            System.out.println("");
        } else {
            System.out.println(agregarEnXPosicion(5, cola, 99));
        }
    }
}
