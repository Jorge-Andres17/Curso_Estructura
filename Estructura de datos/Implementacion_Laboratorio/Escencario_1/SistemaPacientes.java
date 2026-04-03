package Implementacion_Laboratorio.Escencario_1;

import java.util.*;

public class SistemaPacientes {

    Queue<Paciente> colaPacientes = new LinkedList<>();
    HashMap<String, Paciente> mapaPacientes = new HashMap<>();
    HashSet<String> documentos = new HashSet<>();

    public void registrarPaciente(Paciente p) {

        if (documentos.contains(p.documento)) {
            System.out.println("Paciente duplicado");
            return;
        }

        colaPacientes.add(p);
        mapaPacientes.put(p.documento, p);
        documentos.add(p.documento);
    }

    public Paciente buscarPaciente(String documento) {
        return mapaPacientes.get(documento);
    }

    public Paciente atenderPaciente() {
        Paciente p = colaPacientes.poll();

        if (p != null) {
            mapaPacientes.remove(p.documento);
            documentos.remove(p.documento);
        }

        return p;
    }
}
