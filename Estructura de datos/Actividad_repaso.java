public class Actividad_repaso {
    public static void main(String[] args) {
        int num = 21;
        numero_triangular_sin_boolean(num);
    }

    public static void numero_triangular_sin_boolean(int numero) {
        int contador = 1;
        int numero_triangular = 0;

        while (numero_triangular <= numero) {
            if (numero == numero_triangular) {
                System.out.println("Yes");
                break;
            }else{
                numero_triangular += contador;
                contador++;
            }
        }

        if (numero_triangular != numero) {
            System.out.println("No");
        }
    }

    public static void numero_triangular_con_boolean(int numero){
        int contador = 1;
        int numero_triangular = 0;
        boolean encontrado = false;

        while (numero_triangular < numero) {
            numero_triangular += contador;
            contador++;

            if (numero_triangular == numero) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}