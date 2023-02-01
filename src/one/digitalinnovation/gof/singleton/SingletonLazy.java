package one.digitalinnovation.gof.singleton;

/**
 * Singleton "preguiçoso"
 * Este, num primeiro momento, não disponibiliza a instância ao usuário.
 */

public class SingletonLazy {
    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
