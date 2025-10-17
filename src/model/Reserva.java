package model;

import java.time.LocalDate;

public class Reserva implements Transacionavel, RelatorioGeravel {
    private String id;
    private Cliente cliente;
    private Portal portal;
    private LocalDate dataViagem;
    private ClasseTarifa classe;
    private StatusReserva status;
    private double valorTotal;
    private Bilhete itinerario;
    private boolean seguroContratado;
    private RiscoParadoxo riscoParadoxo;

    public Reserva(Builder builder) {
        this.id = builder.id;
        this.cliente = builder.cliente;
        this.portal = builder.portal;
        this.dataViagem = builder.dataViagem;
        this.classe = builder.classe;
        this.status = builder.status;
        this.valorTotal = builder.valorTotal;
        this.itinerario = builder.itinerario;
        this.seguroContratado = builder.seguroContratado;
        this.riscoParadoxo = builder.riscoParadoxo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Portal getPortal() {
        return portal;
    }

    public void setPortal(Portal portal) {
        this.portal = portal;
    }

    public LocalDate getDataViagem() {
        return dataViagem;
    }

    public void setDataViagem(LocalDate dataViagem) {
        this.dataViagem = dataViagem;
    }

    public ClasseTarifa getClasse() {
        return classe;
    }

    public void setClasse(ClasseTarifa classe) {
        this.classe = classe;
    }

    public StatusReserva getStatus() {
        return status;
    }

    public void setStatus(StatusReserva status) {
        this.status = status;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Bilhete getItinerario() {
        return itinerario;
    }

    public void setItinerario(Bilhete itinerario) {
        this.itinerario = itinerario;
    }

    public boolean isSeguroContratado() {
        return seguroContratado;
    }

    public void setSeguroContratado(boolean seguroContratado) {
        this.seguroContratado = seguroContratado;
    }

    public RiscoParadoxo getRiscoParadoxo() {
        return riscoParadoxo;
    }

    public void setRiscoParadoxo(RiscoParadoxo riscoParadoxo) {
        this.riscoParadoxo = riscoParadoxo;
    }
    public void calcularTarifa() {

    }
    public void confirmar() {

    }
    public void cancelar() {

    }
    public void alterar(LocalDate novaData) {

    }
    public void adicionarBagagem() {

    }
    public void adicionarBagagem(double peso) {

    }
    public boolean processarPagamento(Pagamento p) {
        return false;
    }

    public boolean estornar(Pagamento p) {
        return true;
    }

    public String gerarResumo() {
        return null;
    }

//==================================================================\\ CLASSE BUILDER

    public static class Builder {
        private String id;
        private Cliente cliente;
        private Portal portal;
        private LocalDate dataViagem;
        private ClasseTarifa classe;
        private StatusReserva status;
        private double valorTotal;
        private Bilhete itinerario; // composição
        private boolean seguroContratado;
        private RiscoParadoxo riscoParadoxo;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder cliente(Cliente cliente) {
            this.cliente = cliente;
            return this;
        }

        public Builder portal(Portal portal) {
            this.portal = portal;
            return this;
        }

        public Builder dataViagem(LocalDate dataViagem) {
            this.dataViagem = dataViagem;
            return this;
        }

        public Builder classe(ClasseTarifa classe) {
            this.classe = classe;
            return this;
        }

        public Builder status(StatusReserva status) {
            this.status = status;
            return this;
        }

        public Builder valorTotal(double valorTotal) {
            this.valorTotal = valorTotal;
            return this;
        }

        public Builder itinerario(Bilhete itinerario) {
            this.itinerario = itinerario;
            return this;
        }

        public Builder seguroContratado(boolean seguroContratado) {
            this.seguroContratado = seguroContratado;
            return this;
        }

        public Builder riscoParadoxo(RiscoParadoxo riscoParadoxo) {
            this.riscoParadoxo = riscoParadoxo;
            return this;
        }

        public Reserva build() {
            return new Reserva(this);
        }
    }
}