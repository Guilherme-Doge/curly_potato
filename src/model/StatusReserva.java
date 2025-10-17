package model;

public enum StatusReserva {
    PENDENTE("Pendente"),
    CONFIRMADA("Confirmada"),
    CANCELADA("Cancelada"),
    ESTORNADA("Estornada");

    private String statusReserva;

    StatusReserva(String statusReserva) {
        this.statusReserva = statusReserva;
    }

    public String getStatusReserva() {
        return statusReserva;
    }
}