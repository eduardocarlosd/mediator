import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HospedeTest {
    @Test
    void deveElogiarHospedagem() {
        Hospede hospede = new Hospede();
        assertEquals("O Sistema de Reservas agradece seu contato.\nA equipe de hospedagem respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A equipe de hospedagem agradece a mensagem: Ótimo atendimento",
                hospede.realizarReserva("Ótimo atendimento",hospede));
    }

    @Test
    void deveReclamarHospedagem() {
        Hospede hospede = new Hospede();
        assertEquals("O Sistema de Reservas agradece seu contato.\nA equipe de hospedagem respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A equipe de hospedagem vai procurar melhorar o serviço da reclamação: Lentidão no atendimento",
                hospede.cancelarReserva("Lentidão no atendimento",hospede));
    }

    @Test
    void deveSugerirHospedagem() {
        Hospede hospede = new Hospede();
        assertEquals("O Sistema de Reservas agradece seu contato.\nA equipe de hospedagem respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A equipe de hospedagem vai analisar a sugestão: Ampliar horário de check-in/check-out",
                hospede.realizarReserva("Ampliar horário de check-in/check-out",hospede));
    }
}
