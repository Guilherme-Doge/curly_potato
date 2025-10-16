import java.util.List;

public class Portal {
    private String codigo;
    private String origem;
    private String destino; // representação textual da era
    private int capacidadeMaxima;
    private double taxaBase;
    private double fatorParadoxo;
    private int janelaReservaDias;
    private List<Reserva> reservasConfirmadas; // composition: reservas dependem do portal
    private List<Reserva> listaEspera;
    // métodos: verificarDisponibilidade(), ocuparAssento(), liberarAssento()
}
