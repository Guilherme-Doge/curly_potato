package model;

public abstract class Pagamento {
    protected double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    abstract boolean executar() throws ValidacaoException;
}
