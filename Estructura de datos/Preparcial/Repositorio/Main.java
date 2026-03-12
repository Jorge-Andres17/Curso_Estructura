package Preparcial.Repositorio;

import java.util.Iterator;

public class Main {

    public static void main(String[] args){

        Repositorio<String> repo = new Repositorio<>();

        repo.agregar("A");
        repo.agregar("B");
        repo.agregar("C");
        repo.agregar("D");

        System.out.println("Recorrido normal:");

        for(String s : repo){
            System.out.println(s);
        }

        System.out.println("\nRecorrido inverso:");

        Iterator<String> it = repo.iteradorInverso();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
