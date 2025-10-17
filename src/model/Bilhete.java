package model;

public class Bilhete {
    private String codigoBilhete;
    private String detalhesItinerario;

    public Bilhete(String codigoBilhete, String detalhesItinerario) {
        this.codigoBilhete = codigoBilhete;
        this.detalhesItinerario = detalhesItinerario;
    }

    public String getDetalhesItinerario() {
        return detalhesItinerario;
    }

    public String getCodigoBilhete() {
        return codigoBilhete;
    }
}
