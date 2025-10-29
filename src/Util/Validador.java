package Util;

import java.lang.annotation.Repeatable;

import java.time.LocalDate;
import java.util.Scanner;

public class Validador {
    public static boolean validarEmail(String email) {
        if (!validarCampoNaoVazio(email)) {
            System.out.println("E-Mail vazio");
            return false;
        }
        if (!email.contains("@") || !email.contains(".com") || (email.contains(".")) || validarValoresPrecedentesNaoVazio(email, "@")) {
            System.out.println("E-Mail inválido");
            return false;
        }
        if (email.charAt(email.lastIndexOf('.') -1) == ('@') || validarCampoNaoVazio(email.charAt(email.lastIndexOf('.') -1)) ) {

        }
        System.out.println("E-mail válido");
        return true;
    }

    public static void validarDocumento(String documento) {

    }

    public static void validarData(LocalDate data) {

    }

    public static void validarIdade(LocalDate dataNascimento) {

    }

    public static <T> boolean validarCampoNaoVazio(T valor) {
        String s = (String) valor;
        return s.isBlank();
    }

    public static boolean validarValoresPrecedentesNaoVazio(String valor, String caracterPrecedente) {
        if (valor.contains(caracterPrecedente)) {
            if (validarCampoNaoVazio(valor.charAt(valor.lastIndexOf(caracterPrecedente) -1))) {
                return true;
            }
        }
        return false;
    }

    public static boolean validarValoresPrecedentes(String valor, String caracterPrecedente, char... caractereInvalido) {
        if (validarCampoNaoVazio(valor)) {
            for (char c : caractereInvalido) {
                if (valor.charAt(valor.lastIndexOf(caracterPrecedente) - 1) == c) {
                    return true;
                }
            }
        }
        return false;
    }
}
