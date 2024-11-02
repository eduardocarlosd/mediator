public class SistemaReservas {
    private static SistemaReservas instancia = new SistemaReservas();

    private SistemaReservas() {}

    public static SistemaReservas getInstancia() {
        return instancia;
    }

    public String realizarReserva(Hospede hospede, String mensagem) {
        return "O Sistema de Reservas agradece sua solicitacao.\n"+
                "A Reserva foi confirmada conforme mensagem a seguir.\n" +
                ">>" + Recepcionista.getInstancia().confirmarReserva(hospede, mensagem);
    }

    public String cancelarReserva(Hospede hospede, String mensagem) {
        return "O Sistema de Reservas agradece sua solicitacao.\n"+
                "A Reserva foi cancelada conforme mensagem a seguir.\n" +
                ">>" + Recepcionista.getInstancia().cancelarReserva(hospede, mensagem);
    }

    public String realizarCheckIn(Hospede hospede, String mensagem) {
        return "O Sistema de Reservas agradece sua presenca.\n"+
                "O Check-In foi concluido conforme mensagem a seguir.\n" +
                ">>" + Recepcionista.getInstancia().realizarCheckIn(hospede, mensagem);
    }

    public String realizarCheckOut(Hospede hospede, String mensagem) {
        return "O Sistema de Reservas agradece sua estadia.\n"+
                "O Check-Out foi concluido conforme mensagem a seguir.\n" +
                ">>" + Recepcionista.getInstancia().realizarCheckOut(hospede, mensagem);
    }
}
