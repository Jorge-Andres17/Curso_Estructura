package Implementacion_Laboratorio.Escencario_1;

public class Paciente {
    String documento;
    String nombre;
    boolean grave;

    public Paciente(String documento, String nombre, boolean grave) {
        this.documento = documento;
        this.nombre = nombre;
        this.grave = grave;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isGrave() {
        return grave;
    }

    public void setGrave(boolean grave) {
        this.grave = grave;
    }
}


