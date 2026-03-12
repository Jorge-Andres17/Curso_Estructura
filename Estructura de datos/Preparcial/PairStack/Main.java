package Preparcial.PairStack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);

        Pair<Stack<Integer>, Stack<Integer>> resultado = StackUtils.splitStack(s, 3);

        System.out.println("Pila 1: " + resultado.first);
        System.out.println("Pila 2: " + resultado.second);

    }
}
