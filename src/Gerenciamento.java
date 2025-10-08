import java.util.HashMap;
import java.util.Map;

public class Gerenciamento {
    private Map<Integer, Cliente> clientes = new HashMap<Integer, Cliente>();
    private Map<Integer, Agencia> agencias = new HashMap<Integer, Agencia>();
    private Map<Integer, Portal> portais = new HashMap<Integer, Portal>();
    private Map<Integer, Reserva> reservas = new HashMap<Integer, Reserva>();
}