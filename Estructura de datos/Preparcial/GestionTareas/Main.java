package Preparcial.GestionTareas;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ListaDeTareas<Tarea> lista = new ListaDeTareas<>();

        lista.agregarTareas(new Tarea("Estudiar Java", 2, LocalDate.of(2026, 6, 10)));
        lista.agregarTareas(new Tarea("Hacer ejercicio", 1, LocalDate.of(2026, 5, 20)));
        lista.agregarTareas(new Tarea("Entregar proyecto", 3, LocalDate.of(2026, 5, 15)));
        lista.agregarTareas(new Tarea("Leer documentación", 2, LocalDate.of(2026, 5, 18)));

        System.out.println("---- Todas las tareas ----");
        for (Tarea t : lista.listaDeTareas) {
            System.out.println(t);
        }

        System.out.println("\n---- Tareas con prioridad 2 ----");

        ArrayList<Tarea> prioridad = lista.obtenerTareasPorPrioridad(2);

        for (Tarea t : prioridad) {
            System.out.println(t);
        }

        System.out.println("\n---- Tareas ordenadas por fecha de vencimiento ----");

        ArrayList<Tarea> ordenadas = lista.TareasOrdenadasFechaVencimiento();

        for (Tarea t : ordenadas) {
            System.out.println(t);
        }
    }
}