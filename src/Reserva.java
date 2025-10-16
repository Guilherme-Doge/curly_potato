import java.time.LocalDate;

public abstract class Reserva implements Transacionavel, RelatorioGeravel {
    private String id;
    private Cliente cliente;
    private Portal portal;
    private LocalDate dataViagem;
    private ClasseTarifa classe;
    private StatusReserva status;
    private double valorTotal;
    private Bilhete itinerario; // composição
    private boolean seguroContratado;
    // métodos: calcularTarifa(), confirmar(), cancelar(), alterar(), processarPagamento(), estornar()
}