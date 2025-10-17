package model;

import java.time.LocalDate;

public class Agente extends Pessoa {
    private NivelAgente nivel; // enum
    private String agenciaId;

    public Agente(String nome, String documentoID, String email, LocalDate dataNascimento, NivelAgente nivel, String agenciaId) {
        super(nome, documentoID, email, dataNascimento);
        this.nivel = nivel;
        this.agenciaId = agenciaId;
    }

    @Override
    public String getTipo() {
        return "Agente";
    }
    // métodos: autorizarReservaBloqueada(), registrarLog()
}