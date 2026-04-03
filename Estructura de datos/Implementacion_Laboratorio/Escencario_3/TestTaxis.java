package Implementacion_Laboratorio.Escencario_3;

public class TestTaxis {

    public static void main(String[] args) {

        SistemaTaxis sistema = new SistemaTaxis();

        int n = 50000;

        long inicio = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {

            sistema.registrarSolicitud(
                    new Solicitud(
                            "SOL" + i,
                            "Usuario" + i,
                            "Ubicacion" + i));
        }

        long fin = System.currentTimeMillis();

        System.out.println("Tiempo registrar solicitudes: " + (fin - inicio) + " ms");

        inicio = System.currentTimeMillis();

        sistema.cancelarSolicitud("SOL20000");

        fin = System.currentTimeMillis();

        System.out.println("Tiempo cancelar solicitud: " + (fin - inicio) + " ms");

        inicio = System.currentTimeMillis();

        Solicitud s = sistema.atenderSolicitud();

        fin = System.currentTimeMillis();

        System.out.println("Tiempo atender solicitud: " + (fin - inicio) + " ms");

        System.out.println("Solicitud atendida: " + s.usuario);
    }
}