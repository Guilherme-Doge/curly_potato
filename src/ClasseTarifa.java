public enum ClasseTarifa {
    ECONOMY("Economy"),
    BUSINESS("Business"),
    TIME_LORD("Time Lord");

    private String classeTarifa;

    ClasseTarifa(String classeTarifa) {
        this.classeTarifa = classeTarifa;
    }

    public String getClasseTarifa() {
        return classeTarifa;
    }
}
