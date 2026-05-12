package mediator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MediatorTest {

    @Test
    void deveEnviarMensagemEntreFuncionarios() {

        CentralPizzaria central = new CentralPizzaria();

        Garcom garcom = new Garcom(central);
        Cozinheiro cozinheiro = new Cozinheiro(central);
        Entregador entregador = new Entregador(central);

        central.setGarcom(garcom);
        central.setCozinheiro(cozinheiro);
        central.setEntregador(entregador);

        garcom.enviar("Novo pedido de pizza");

        assertNotNull(central);
    }
}