package Implementacion_Laboratorio.Escencario_1;

public class Main {
    public static void main(String[] args) {

        SistemaPacientes sistema = new SistemaPacientes();

        int n = 100000;

        long inicio = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {
            sistema.registrarPaciente(new Paciente(
                    "DOC" + i,
                    "Paciente" + i,
                    false));
        }

        long fin = System.currentTimeMillis();

        System.out.println("Tiempo registrar: " + (fin - inicio) + " ms");

        inicio = System.currentTimeMillis();

        sistema.buscarPaciente("DOC50000");

        fin = System.currentTimeMillis();

        System.out.println("Tiempo buscar: " + (fin - inicio) + " ms");
    }
}
