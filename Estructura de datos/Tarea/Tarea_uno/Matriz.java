package Tarea.Tarea_uno;

import java.util.Random;

public class Matriz {

    public static void main(String[] args) {
        // int[][] matriz = imprimir_matriz(3, 3);
        // int suma = suma_diagonal_principal(matriz);
        // System.out.print("\nesta es la suma de la diagonal: " + suma);

        int filas = 3;
        int columnas = 3;
        int[][] matriz = new int[filas][columnas];
        Random random = new Random();

        matriz = imprimir_matriz_recursiva(0, 0, filas, columnas, random, matriz);
        int suma = suma_diagonal_principal_recursiva(0, 0, matriz);

        System.out.print("\nesta es la suma de la diagonal: " + suma);
    }

    public static int[][] imprimir_matriz(int fila, int columna) {
        int[][] matriz = new int[fila][columna];
        Random random = new Random();
        for (int filas = 0; filas < fila; filas++) {
            System.out.println();
            for (int columnas = 0; columnas < columna; columnas++) {
                int valor = random.nextInt(20);
                matriz[filas][columnas] = valor;
                System.out.print(valor + " ");
            }
        }
        return matriz;
    }

    public static int[][] imprimir_matriz_recursiva(int filaActual, int columnaActual, int filas, int columnas,
            Random random, int[][] matriz) {
        if (filaActual < filas) {
            if (columnaActual < columnas) {
                int valor = random.nextInt(20);
                matriz[filaActual][columnaActual] = valor;
                System.out.print(valor + " ");
                imprimir_matriz_recursiva(filaActual, columnaActual + 1, filas, columnas, random, matriz);
            } else if (columnaActual == columnas) {
                System.out.println();
                imprimir_matriz_recursiva(filaActual + 1, 0, filas, columnas, random, matriz);
            }
        }
        return matriz;
    }

    public static int suma_diagonal_principal(int[][] matriz) {
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    contador += matriz[i][j];
                }
            }
        }
        return contador;
    }

    public static int suma_diagonal_principal_recursiva(int fila, int columna, int[][] matriz) {
        if (fila >= matriz.length || columna >= matriz[fila].length) {
            return 0;
        }

        int sumaActual = 0;
        if (fila == columna) {
            sumaActual = matriz[fila][columna];
        }

        return sumaActual + suma_diagonal_principal_recursiva(fila + 1, columna + 1, matriz);
    }

}
