package Service;

import Util.*;

import java.sql.SQLOutput;

public class ClienteService {
    public static void criarCliente() {
        while (true) {
            try {
                System.out.print("Insira o nome do cliente: ");
                String nome = ConsoleHelper.lerString();
                while (nome.isBlank()) {

                }
                /**
                 * String nome;
                 * String documentoID;
                 * String email;
                 * LocalDate dataNascimento;
                 * int pontosTempo;
                 * int pontuacaoParadoxo;
                 * boolean bloqueado;
                 * List<Reserva> reservas;
                 */
            } catch (Exception e) {
                System.out.println("Algo deu errado");
            }
        }
    }

    public static void listarClientes() {

    }

    public static void atualizarCliente() {

    }

    public static void removerCliente() {

    }

    public static void buscarClientePorDocumento(String documento) {

    }
}