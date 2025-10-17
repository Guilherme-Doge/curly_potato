package model;

import java.util.ArrayList;
import java.util.List;

public class Portal {
    private String codigo;
    private String origem;
    private String destino;
    private int capacidadeMaxima;
    private double taxaBase;
    private double fatorParadoxo;
    private int janelaReservaDias;
    private List<Reserva> reservasConfirmadas;
    private List<Reserva> listaEspera;


    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getOrigem() {
        return this.origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return this.destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getCapacidadeMaxima() {
        return this.capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public double getTaxaBase() {
        return this.taxaBase;
    }

    public void setTaxaBase(double taxaBase) {
        this.taxaBase = taxaBase;
    }

    public double getFatorParadoxo() {
        return this.fatorParadoxo;
    }

    public void setFatorParadoxo(double fatorParadoxo) {
        this.fatorParadoxo = fatorParadoxo;
    }

    public int getJanelaReservaDias() {
        return this.janelaReservaDias;
    }

    public void setJanelaReservaDias(int janelaReservaDias) {
        this.janelaReservaDias = janelaReservaDias;
    }

    public List<Reserva> getReservasConfirmadas() {
        return this.reservasConfirmadas;
    }

    public void setReservasConfirmadas(List<Reserva> reservasConfirmadas) {
        this.reservasConfirmadas = reservasConfirmadas;
    }

    public List<Reserva> getListaEspera() {
        return this.listaEspera;
    }

    public void setListaEspera(List<Reserva> listaEspera) {
        this.listaEspera = listaEspera;
    }

    public void verificarDisponibilidade() {

    }
    public void ocuparAssento(Reserva r) {

    }
    public void liberarAssento(Reserva r) {

    }
    public void adicionarListaEspera(Reserva r) {

    }
    public void calcularOcupacao() {

    }

//==================================================================\\ CLASSE BUILDER

    public static class Builder {
        private String codigo;
        private String origem;
        private String destino;
        private int capacidadeMaxima;
        private double taxaBase;
        private double fatorParadoxo;
        private int janelaReservaDias;
        private List<Reserva> reservasConfirmadas;
        private List<Reserva> listaEspera;

        public Builder codigo(String codigo) {
            this.codigo = codigo;
            return this;
        }

        public Builder origem(String origem) {
            this.origem = origem;
            return this;
        }

        public Builder destino(String capacidadeMaxima) {
            this.destino = destino;
            return this;
        }

        public Builder capacidadeMaxima(int capacidadeMaxima) {
            this.capacidadeMaxima = capacidadeMaxima;
            return this;
        }

        public Builder taxaBase(double taxaBase) {
            this.taxaBase = taxaBase;
            return this;
        }

        public Builder fatorParadoxo(double fatorParadoxo) {
            this.fatorParadoxo = fatorParadoxo;
            return this;
        }

        public Builder janelaReservaDias(int janelaReservaDias) {
            this.janelaReservaDias = janelaReservaDias;
            return this;
        }

        public Builder reservasConfirmadas() {
            this.reservasConfirmadas = new ArrayList<Reserva>();
            return this;
        }

        public Builder listaEspera() {
            this.listaEspera = new ArrayList<Reserva>();;
            return this;
        }

    }
}