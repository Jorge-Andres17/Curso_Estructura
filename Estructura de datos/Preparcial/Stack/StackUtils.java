package Preparcial.Stack;
import java.util.Stack;

public class StackUtils {

    public static Stack<Integer> spliceStack(Stack<Integer> s, int i, int j){

        Stack<Integer> temp = new Stack<>();
        Stack<Integer> removed = new Stack<>();

        // Paso 1: invertir la pila
        while(!s.isEmpty()){
            temp.push(s.pop());
        }

        int index = 0;

        // Paso 2: recorrer desde el fondo
        while(!temp.isEmpty()){

            int valor = temp.pop();

            if(index >= i && index < j){
                removed.push(valor);
            }else{
                s.push(valor);
            }

            index++;
        }

        return removed;
    }

    public static void main(String[] args){

        Stack<Integer> pila = new Stack<>();

        pila.push(10);
        pila.push(20);
        pila.push(30);
        pila.push(40);
        pila.push(50);
        pila.push(60);

        System.out.println("Pila original: " + pila);

        Stack<Integer> extraidos = spliceStack(pila,2,4);

        System.out.println("Elementos extraidos: " + extraidos);
        System.out.println("Pila final: " + pila);

    }
}