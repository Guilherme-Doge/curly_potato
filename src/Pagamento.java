public abstract class Pagamento {
    protected double valor;
    abstract boolean executar() throws ValidacaoException;
}
