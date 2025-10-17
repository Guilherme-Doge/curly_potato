package model;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {
    private int pontosTempo;
    private int pontuacaoParadoxo;
    private boolean bloqueado;
    private List<Reserva> reservas;

    private Cliente(Builder builder) {
        super(builder.nome, builder.documentoID, builder.email, builder.dataNascimento);
        this.pontosTempo = builder.pontosTempo;
        this.pontuacaoParadoxo = builder.pontuacaoParadoxo;
        this.bloqueado = builder.bloqueado;
        this.reservas = builder.reservas != null ? builder.reservas : new ArrayList<>();
    }

    public int getPontosTempo() {
        return pontosTempo;
    }

    public void setPontosTempo(int pontosTempo) {
        this.pontosTempo = pontosTempo;
    }

    public int getPontuacaoParadoxo() {
        return pontuacaoParadoxo;
    }

    public void setPontuacaoParadoxo(int pontuacaoParadoxo) {
        this.pontuacaoParadoxo = pontuacaoParadoxo;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public void adicionarReserva(Reserva r) {
        this.reservas.add(r);
    }

    public void removerReserva(Reserva r) {
        this.reservas.remove(r);
    }

    public Period calcularIdade() {
        LocalDate nascimento = super.getDataNascimento();
        return Period.between(nascimento, LocalDate.now());
    }

    public void aplicarPontos(int pontos) {
        this.pontosTempo += pontos;
    }

    public void acumularPontos(double valor) {
        this.pontosTempo += (int) (valor * 0.1);
    }

    public void atualizarPontuacaoParadoxo(int valor) {
        this.pontuacaoParadoxo += valor;
    }

    public String getTipo() {
        return "Cliente";
    }

//==================================================================\\ CLASSE BUILDER

    public static class Builder {
        private String nome;
        private String documentoID;
        private String email;
        private LocalDate dataNascimento;
        private int pontosTempo;
        private int pontuacaoParadoxo;
        private boolean bloqueado;
        private List<Reserva> reservas;

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

        public Builder pontosTempo(int pontosTempo) {
            this.pontosTempo = pontosTempo;
            return this;
        }

        public Builder pontuacaoParadoxo(int pontuacaoParadoxo) {
            this.pontuacaoParadoxo = pontuacaoParadoxo;
            return this;
        }

        public Builder bloqueado(boolean bloqueado) {
            this.bloqueado = bloqueado;
            return this;
        }

        public Builder reservas(List<Reserva> reservas) {
            this.reservas = reservas;
            return this;
        }

        public Cliente build() {
            return new Cliente(this);
        }
    }
}