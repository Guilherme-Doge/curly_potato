package model;

public class Agente extends Pessoa {
    private NivelAgente nivel; // enum
    private String agenciaId;

    @Override
    public String getTipo() {
        return "Agente";
    }
    // métodos: autorizarReservaBloqueada(), registrarLog()
}