package Util;

import Service.AgenciaService;

import java.time.LocalDate;

public class Validador {
    public void validarEmail(String email) {
    }

    public void validarDocumento(String documento) {

    }

    public void validarData(LocalDate data) {

    }

    public void validarIdade(LocalDate dataNascimento) {

    }

    public boolean validarCampoNaoVazio(String valor) {
        return (valor.isBlank())? false : true;
    }
}
