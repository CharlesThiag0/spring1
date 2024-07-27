package one.dio.gof;

/**
 *  Singleton "apressado".
 *
 * @autor Charles
 */
public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }
    public static SingletonEager getInstancia (){
        return instancia;
    }
}
