public interface Transacionavel {
    boolean processarPagamento(Pagamento p) throws ReservaException;

    boolean estornar(Pagamento p) throws ReservaException;
}