package one.digitalInnovation.gof.singleton;

/**
 * Singleton "apressado"
 *
 * @author lgmro
 */

public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstance() {
        return  instancia;
    }

}
