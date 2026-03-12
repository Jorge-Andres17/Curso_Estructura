package Preparcial.Queue;

import java.util.Queue;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        Queue<Integer> cola1 = new LinkedList<>();
        cola1.add(1);
        cola1.add(3);
        cola1.add(5);

        Queue<Integer> cola2 = new LinkedList<>();
        cola2.add(2);
        cola2.add(4);
        cola2.add(6);

        Queue<Integer> resultado = QueueUtils.mergeQueues(cola1, cola2);

        System.out.println(resultado);
    }
}