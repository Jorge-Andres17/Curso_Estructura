package Preparcial.Queue;

import java.util.Queue;
import java.util.LinkedList;

public class QueueUtils {

    public static <T> Queue<T> mergeQueues(Queue<T> cola1, Queue<T> cola2){

        Queue<T> resultado = new LinkedList<>();

        while(!cola1.isEmpty() || !cola2.isEmpty()){

            if(!cola1.isEmpty()){
                resultado.add(cola1.poll());
            }

            if(!cola2.isEmpty()){
                resultado.add(cola2.poll());
            }
        }

        return resultado;
    }
}
