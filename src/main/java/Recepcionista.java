public class Recepcionista implements Setor{
    private static Recepcionista instancia = new Recepcionista();

    private Recepcionista() {}

    public static Recepcionista getInstancia() {
        return instancia;
    }

    public String confirmarReserva(Hospede hospede, String mensagem) {
        return "A reserva de " + hospede.toString() + " foi confirmada. Detalhes: " + mensagem;
    }

    public String cancelarReserva(Hospede hospede, String mensagem) {
        return "A reserva de " + hospede.toString() + " foi cancelada. Motivo: " + mensagem;
    }

    public String realizarCheckIn(Hospede hospede, String mensagem) {
        return "O Check-In de " + hospede.toString() + " foi realizado. Detalhes: " + mensagem;
    }

    public String realizarCheckOut(Hospede hospede, String mensagem) {
        return "O Check-Out de " + hospede.toString() + " foi realizado. Detalhes: " + mensagem;
    }
}
