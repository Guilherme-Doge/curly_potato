package model;

public enum NivelAgente {
    JUNIOR("Júnior"),
    SENIOR("Sênior"),
    ADMIN("Admin");

    private String NivelAgente;

    NivelAgente(String NivelAgente) {
        this.NivelAgente = NivelAgente;
    }

    public String getNivelAgente() {
        return this.NivelAgente;
    }
}
