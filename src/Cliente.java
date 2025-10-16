import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class Cliente extends Pessoa {
    private int pontosTempo;
    private int pontuacaoParadoxo;
    private boolean bloqueado;
    private List<Reserva> reservas; //

    public int getPontosTempo() {
        return pontosTempo;
    }

    public void setPontosTempo(int pontosTempo) {
        this.pontosTempo = pontosTempo;
    }

    public int getPontuacaoParadoxo() {
        return pontuacaoParadoxo;
    }

    public void setPontuacaoParadoxo(int pontuacaoParadoxo) {
        this.pontuacaoParadoxo = pontuacaoParadoxo;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public void adicionarReserva(Reserva r) {
        this.reservas.add(r);
    }

    public void removerReserva(Reserva r) {
        this.reservas.remove(r);
    }

public Period calcularIdade() {
        int ano = super.getDataNascimento().getYear();
        int mes = super.getDataNascimento().getMonthValue();
        int dia = super.getDataNascimento().getDayOfMonth();
        LocalDate dataNascimento = LocalDate.of(ano, mes, dia);
        LocalDate.now();
        return Period.between(LocalDate.now(), dataNascimento);
}

public void aplicarPontos(int pontos) {

}

public void acumularPontos(double valor) {

}

public void atualizarPontuacaoParadoxo(int valor) {
    this.pontuacaoParadoxo = this.pontuacaoParadoxo + valor;
}

public String getTipo() {
    return "Cliente";
}
}
