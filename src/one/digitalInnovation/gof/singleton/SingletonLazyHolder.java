package one.digitalInnovation.gof.singleton;

/**
 * Singleton "Lazer Holder"
 *
 * @author lgmro
 */

public class SingletonLazyHolder {
    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance() {
        return  InstanceHolder.instancia;
    }

}
