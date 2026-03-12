package Taller;

public class Divide_venceras {
    
    public static void main(String[] args) {
        int[] arreglo = {3,5,7,9,2,8};
        int suma = sumarArreglo(arreglo);
        System.out.println("La suma del arreglo es: " + suma);
    }

    public static int sumarArreglo(int[] arreglo) {
        return sumarArreglo(arreglo, 0, arreglo.length - 1);
    }

    private static int sumarArreglo (int[] arreglo, int inicio, int fin) {
        if (inicio == fin) {
            return arreglo[inicio];
        }

        int medio = (inicio + fin) / 2;

            int sumarIzquierda = sumarArreglo(arreglo, inicio, medio);
        int sumarDerecha = sumarArreglo(arreglo, medio + 1, fin);
        
        return sumarIzquierda + sumarDerecha;
    }
}