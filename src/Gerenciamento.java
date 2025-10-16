import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Gerenciamento {
    private Map<String, Cliente> clientes = new HashMap<>();
    private Map<String, Agente> agentes = new HashMap<>();
    private Map<String, Portal> portais = new HashMap<>();
    private List<Reserva> todasReservas = new ArrayList<>();
    private List<String> logs = new ArrayList<>();
    // métodos: menuPrincipal(), carregarDadosExemplo(), salvarLogs(), etc.
}