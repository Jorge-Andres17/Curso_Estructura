package Taller;

/**
 * Clase que implementa la suma de elementos de un arreglo
 * usando el paradigma de Divide y Vencerás (recursión)
 */
public class SumaArregloDivideVenceras {

    /**
     * Método recursivo que suma los elementos de un arreglo usando divide y
     * vencerás
     * 
     * @param arreglo El arreglo de números enteros
     * @param inicio  Índice inicial del segmento a sumar
     * @param fin     Índice final del segmento a sumar
     * @return La suma de los elementos en el rango [inicio, fin]
     */
    public static int sumaRecursiva(int[] arreglo, int inicio, int fin) {
        // Caso base: si solo hay un elemento
        if (inicio == fin) {
            return arreglo[inicio];
        } else {
            // Divide: encontrar el punto medio
            int mitad = (inicio + fin) / 2;

            // Mostrar el proceso de división
            System.out.println("mitad: " + mitad);
            System.out.println("inicio: " + inicio);
            System.out.println("fin: " + fin);
            System.out.println();

            // Vencerás: resolver recursivamente las dos mitades
            int X = sumaRecursiva(arreglo, inicio, mitad);
            System.out.println("X: " + X);

            int Y = sumaRecursiva(arreglo, mitad + 1, fin);
            System.out.println("Y: " + Y);

            // Combinar: sumar los resultados de ambas mitades
            return X + Y;
        }
    }

    /**
     * Método main para probar la implementación
     */
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        System.out.println("Suma total: " + sumaRecursiva(array, 0, array.length - 1));
    }
}

