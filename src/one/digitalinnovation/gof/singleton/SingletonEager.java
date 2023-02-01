package one.digitalinnovation.gof.singleton;

/**
 * Singleton "apressado"
 * Este, em vez de antes fazer a verificação da instância ser nula ou não, já atribui a instância.
 * No momento em que essa classe for acionada, a instância já é atribuída e quando chamada, estará pronta para ser retornada.
 */

public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}
