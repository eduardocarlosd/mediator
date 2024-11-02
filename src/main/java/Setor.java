public interface Setor {
    String confirmarReserva(Hospede hospede, String mensagem);
    String cancelarReserva(Hospede hospede, String mensagem);
    String realizarCheckIn(Hospede hospede, String mensagem);
    String realizarCheckOut(Hospede hospede, String mensagem);
}
