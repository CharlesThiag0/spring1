package one.dio.gof.singleton;

/**
 *  Singleton "lazy holder".
 *
 * @autor Charles
 */
public class SingletonLazyHolder {

    private static class InstaceHolder {
         private static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia (){
        return InstaceHolder.instancia;
    }
}
