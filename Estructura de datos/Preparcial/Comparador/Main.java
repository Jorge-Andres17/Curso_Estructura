package Preparcial.Comparador;

public class Main {
    public static void main(String[] args) {

        ComparadorGenerico<String> comp = new ComparadorGenerico<>();

        int resultado = comp.comparar("holaa", "hola");

        System.out.println(resultado);
    }
}
