package Taller_en_clase.Escenario_2;

import java.util.Stack;

public class Balanceador {
    
    public static void main(String[] args) {
        String expresion = "{[a+b]*(c-d)}";
        String expresion2 = "[a+b)";

        System.out.println(verificar_expresion(expresion));
        System.out.println(verificar_expresion(expresion2));
    }

    private static String verificar_expresion(String expresion) {
        Stack<Character> pila = new Stack<>();

        for ( int i = 0; i < expresion.length(); i++){
            char b = expresion.charAt(i);

            if (b == '(' || b == '{' || b == '[') {
                pila.push(b);
            }else if (b == ')' || b == '}' || b == ']') {

                if (pila.isEmpty()) {
                    return "Expresion Invalida";
                }

                char abierto = pila.pop();

                if ((b == ')' && abierto != '(') ||
                    (b == '}' && abierto != '{') ||
                    (b == ']' && abierto != '[')) {
                    return "Expresion Invalida";
                }
            }
        }

        if (pila.isEmpty()) {
            return "Expresion Valida";
        }else{
            return "Expresion Invalida";
        }
    }
}
