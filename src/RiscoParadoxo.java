public enum RiscoParadoxo {
    LOW("Low"),
    MEDIUM("Medium"),
    HIGH("High");

    private String riscoParadoxo;

    RiscoParadoxo(String riscoParadoxo) {
        this.riscoParadoxo = riscoParadoxo;
    }

    public String getRiscoParadoxo() {
        return this.riscoParadoxo;
    }
}
