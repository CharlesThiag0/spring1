package one.dio.gof.singleton;

/**
 *  Singleton "preguiçoso".
 *
 * @autor Charles
 */
public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();

    }

    public static SingletonLazy getInstancia (){
        if(instancia == null){
            instancia = new SingletonLazy();
        }

        return instancia;
    }
}
