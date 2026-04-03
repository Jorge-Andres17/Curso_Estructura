package Implementacion_Laboratorio.Escencario_3;

import java.util.*;

public class SistemaTaxis {

    Queue<Solicitud> cola = new LinkedList<>();
    HashMap<String, Solicitud> mapa = new HashMap<>();

    public void registrarSolicitud(Solicitud s) {

        cola.add(s);
        mapa.put(s.id, s);
    }

    public Solicitud atenderSolicitud() {

        Solicitud s = cola.poll();

        if(s != null) {
            mapa.remove(s.id);
        }

        return s;
    }

    public void cancelarSolicitud(String id) {

        Solicitud s = mapa.remove(id);

        if(s != null) {
            cola.remove(s);
        }
    }

    public void mostrarPendientes() {

        for(Solicitud s : cola) {
            System.out.println(s.usuario + " - " + s.ubicacion);
        }
    }
}