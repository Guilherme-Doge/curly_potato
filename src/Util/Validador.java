package Util;

import Exceptions.ValidacaoException;

import java.time.LocalDate;
import java.util.Scanner;

public class Validador {
    public static void validarEmail(String email) throws ValidacaoException {
        try {
            if (!validarCampoNaoVazio(email)) {
                System.out.println("E-Mail vazio");
                throw new ValidacaoException("E-Mail vazio");
            }
            if (!email.contains("@") || !email.contains(".com") || (email.contains(".")) || validarValoresPrecedentesNaoVazio(email, "@")) {
                System.out.println("E-Mail inválido");
                throw new ValidacaoException("E-Mail Inválido");
            }
            if (email.charAt(email.lastIndexOf('.') -1) == ('@') || validarCampoNaoVazio(email.charAt(email.lastIndexOf('.') -1)) ) {

            }
        } catch (IndexOutOfBoundsException e) {
        }
        System.out.println("E-mail válido");
    }

    public static void validarDocumento(String documento) {

    }

    public static void validarData(LocalDate data) {

    }

    public static void validarIdade(LocalDate dataNascimento) {

    }

    public static <T> boolean validarCampoNaoVazio(T valor) throws IndexOutOfBoundsException {
        String s = (String) valor;
        return s.isBlank();
    }

    public static boolean validarValoresPrecedentesNaoVazio(String valor, String caracterPrecedente) throws IndexOutOfBoundsException {
        if (valor.contains(caracterPrecedente)) {
            if (validarCampoNaoVazio(valor.charAt(valor.lastIndexOf(caracterPrecedente) -1))) {
                return true;
            }
        }
        return false;
    }

    public static boolean validarValoresPrecedentes(String valor, String caracterPrecedente, char... caractereInvalido) throws IndexOutOfBoundsException {
        if (validarCampoNaoVazio(valor)) {
            for (char c : caractereInvalido) {
                if (valor.charAt(valor.lastIndexOf(caracterPrecedente) - 1) == c) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean validarValoresSubsequenteNaoVazio(String valor, String caracterPrecedente) throws IndexOutOfBoundsException {
        if (valor.contains(caracterPrecedente)) {
            if (validarCampoNaoVazio(valor.charAt(valor.lastIndexOf(caracterPrecedente) +1))) {
                return true;
            }
        }
        return false;
    }

    public static boolean validarValoresSubsequentes(String valor, String caracterPrecedente, char... caractereInvalido) throws IndexOutOfBoundsException {
        if (validarCampoNaoVazio(valor)) {
            for (char c : caractereInvalido) {
                if (valor.charAt(valor.lastIndexOf(caracterPrecedente) + 1) == c) {
                    return true;
                }
            }
        }
        return false;
    }
}
