package Service;

import model.*;

import java.util.*;

public class SistemaChrono {
    private static Map<String, Cliente> clientes = new HashMap<>();
    private static Map<String, Agente> agentes = new HashMap<>();
    private static Map<String, Portal> portais = new HashMap<>();
    private static Map<String, Agencia> agencias = new HashMap<>();
    private static List<Reserva> todasReservas = new ArrayList<>();
    private static List<String> logs = new ArrayList<>();
    private static Scanner SC = new Scanner(System.in);
    private static int escolha = 0;


    public static void main(String args[]) {
        menuPrincipal();
        System.out.println("Encerrando atividades...");
    }

    public static void menuPrincipal() {
        while (escolha != 8) {
            try {
                escolha = SC.nextInt();
                switch (escolha) {
                    case 1 : {
                        menuClientes();
                        break;
                    }
                    case 2 : {
                        menuAgencias();
                        break;
                    }
                    case 3 : {
                        menuAgentes();
                        break;
                    }
                    case 4 : {
                        menuPortais();
                        break;
                    }
                    case 5 : {
                        menuReservas();
                        break;
                    }
                    case 6 : {
                        menuRelatorios();
                        break;
                    }
                    case 7 : {
                        menuLogs();
                        break;
                    }
                    case 8 : {
                        return;
                    }
                    default : {
                        System.out.println("Opção inválida");
                    }
                }
            } catch (Exception e) {
                System.out.println("Algo deu errado. Tente novamente");
            }
        }
    }

    public static void menuClientes() {
        while (escolha != 5) {
            try {
                System.out.println("""
                        1 - Criar Cliente
                        2 - Listar Clientes
                        3 - Editar Clientes
                        4 - Excluir Clientes
                        5 - Sair
                        """);
                escolha = SC.nextInt();
                switch (escolha) {
                    case 1 : {
                        ClienteService.criarCliente();
                    }
                }
            } catch (Exception e) {
                System.out.println("Algo deu errado");
            }
        }
    }

    public static void menuAgencias() {

    }

    public static void menuAgentes() {

    }

    public static void menuPortais() {

    }

    public static void menuReservas() {

    }

    public static void menuRelatorios() {

    }

    public static void menuLogs() {

    }

    public static void carregarDadosExemplo() {

    }

    public static void registrarLog(String mensagem) {

    }

    public static void gerarRelatorioReceitaPorPortal() {

    }

    public static void gerarRelatorioOcupacao() {

    }

    public static void gerarRelatorioClientesComParadoxoAlto() {

    }

    public static void buscarClientePorId(String id) {

    }

    public static void buscarAgentePorId(String id) {

    }

    public static void buscarPortalPorCodigo(String codigo) {

    }

    public static void salvarLogs() {

    }
}