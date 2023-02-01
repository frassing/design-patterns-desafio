package one.digitalinnovation.gof.strategy;

// Implementação da Strategy Comportamento

public class ComportamentoNormal implements Comportamento {
    @Override
    public void mover() {
        System.out.println("Movendo-se normalmente...");
    }
}
