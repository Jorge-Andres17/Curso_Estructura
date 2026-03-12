package Preparcial.PairList;

public class Main {

    public static void main(String[] args) {

        PairList<String, Integer> lista = new PairList<>();

        lista.agregar("Juan", 20);
        lista.agregar("Ana", 22);
        lista.agregar("Pedro", 19);

        lista.mostrar();

        System.out.println("Edad de Ana: " + lista.obtener("Ana"));

        lista.eliminar("Juan");

        System.out.println("Lista después de eliminar:");
        lista.mostrar();

    }

}
