package model;

import java.time.LocalDate;

public class Agente extends Pessoa {
    private NivelAgente nivel; // enum
    private String agenciaId;

    public Agente(Builder builder) {
        super(builder.nome, builder.documentoID, builder.email, builder.dataNascimento);
        this.nivel = builder.nivel;
        this.agenciaId = builder.agenciaId;
    }

    public void autorizarReservaBloqueada(Cliente c) {

    }

    public void registrarLog(String mensagem) {

    }

    @Override
    public String getTipo() {
        return "Agente";
    }

    public static class Builder {
        private String nome;
        private String documentoID;
        private String email;
        private LocalDate dataNascimento;
        private NivelAgente nivel;
        private String agenciaId;

        public Builder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder documentoID(String documentoID) {
            this.documentoID = documentoID;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder dataNascimento(LocalDate dataNascimento) {
            this.dataNascimento = dataNascimento;
            return this;
        }

        public Builder nivel(NivelAgente nivel) {
            this.nivel = nivel;
            return this;
        }

        public Builder agenciaId(String agenciaId) {
            this.agenciaId = agenciaId;
            return this;
        }

        public Agente build() {
            return new Agente(this);
        }
    }
}