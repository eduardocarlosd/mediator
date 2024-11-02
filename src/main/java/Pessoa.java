public class Pessoa {
    public String realizarReserva(String mensagem, Hospede hospede) {
        return SistemaReservas.getInstancia().realizarReserva(hospede,mensagem);
    }

    public String cancelarReserva(String mensagem, Hospede hospede) {
        return SistemaReservas.getInstancia().cancelarReserva(hospede,mensagem);
    }

    public String realizarCheckIn(String mensagem, Hospede hospede) {
        return SistemaReservas.getInstancia().realizarCheckIn(hospede,mensagem);
    }

    public String realizarCheckOut(String mensagem, Hospede hospede) {
        return SistemaReservas.getInstancia().realizarCheckOut(hospede,mensagem);
    }
}
