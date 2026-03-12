package Preparcial.PairStack;

import java.util.Stack;

public class StackUtils {

    public static Pair<Stack<Integer>, Stack<Integer>> splitStack(Stack<Integer> s, int i){

        Stack<Integer> temp = new Stack<>();
        Stack<Integer> pila1 = new Stack<>();
        Stack<Integer> pila2 = new Stack<>();

        while(!s.isEmpty()){
            temp.push(s.pop());
        }

        int index = 0;

        while(!temp.isEmpty()){

            int valor = temp.pop();

            if(index < i){
                pila1.push(valor);
            }else{
                pila2.push(valor);
            }

            index++;
        }

        return new Pair<>(pila1, pila2);
    }
}
