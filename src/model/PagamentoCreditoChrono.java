package model;

import Exceptions.ValidacaoException;

public class PagamentoCreditoChrono extends Pagamento {
    private String idCliente;
    private double saldoDisponivel;

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public double getSaldoDisponivel() {
        return saldoDisponivel;
    }

    public void setSaldoDisponivel(double saldoDisponivel) {
        this.saldoDisponivel = saldoDisponivel;
    }

    public void debitarSaldo(double valor) {

    }

    public void recarregarSaldo(double valor) {

    }

    @Override
    boolean executar() throws ValidacaoException {
        return false;
    }
}
