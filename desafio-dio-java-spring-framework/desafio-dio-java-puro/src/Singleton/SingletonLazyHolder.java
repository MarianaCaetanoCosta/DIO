package Singleton;

/**
 * Singleton "LazyHolder".
 * Consumo e uso de memória mais otimizado
 * @see <a href="https://stackoverflow.com/a/24018148">Referencia</a>
 * @autor: Mariana Caetano Costa
 */
public class SingletonLazyHolder {

    //Encapsula a instancia em uma classe estatica interna
    private static class InstanciaHolder {
        private static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    public SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia(){
        return InstanciaHolder.instancia;
    }
}
