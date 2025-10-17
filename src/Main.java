import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static Scanner SC = new Scanner(System.in);
    public static Gerenciamento GERENCIAMENTO = new Gerenciamento();
    public static void main(String[] args) {
        int escolha = 0;
        do {
            try {
                System.out.println("1 - Gerenciar Clientes\n2 - Gerenciar Agências/Agentes\n3 - Gerenciar Portais\n4 - Gerenciar Reservas\n5 - Relatórios\n6 - Logs de Transações\n7 - Sair");
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
                        menuPortais();
                        break;
                    }
                    case 4 : {
                        menuReservas();
                        break;
                    }
                    case 5 : {
                        menuRelatorios();
                        break;
                    }
                    case 6 : {
                        menuLogsTransacao();
                        break;
                    }
                    case 7 : {
                        System.exit(0);
                        break;
                    }
                    default: {
                        throw new InputMismatchException("Opção Inválida");
                    }
                }
            } catch (InputMismatchException e) {

            }
        } while (escolha != 7);
    }
//==================================================================\\ CLIENTES

    public static void menuClientes() {

    }

//==================================================================\\ AGENCIAS

    public static void menuAgencias() {

    }

//==================================================================\\ PORTAIS

    public static void menuPortais() {

    }

//==================================================================\\ RESERVAS

    public static void menuReservas() {

    }

//==================================================================\\ RELATÓRIOS

    public static void menuRelatorios() {

    }

//==================================================================\\ LOGS DE TRANSAÇÃO

    public static void menuLogsTransacao() {

    }
}