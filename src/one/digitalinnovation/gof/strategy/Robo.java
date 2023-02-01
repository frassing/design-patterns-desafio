package one.digitalinnovation.gof.strategy;

// Contexto da strategy

public class Robo {

    private Comportamento comportamento;

//    Para modificar a estratégia de comportamento do robô.
    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void mover() {
        comportamento.mover();
    }
}
