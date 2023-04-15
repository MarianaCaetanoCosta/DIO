package one.digitalinnovation.gof;

public class SingletonEager {
    /**
     * Singleton "apressado".
     * @autor: Mariana Caetano Costa
     */

    //Cria e instancia
    private static SingletonEager instancia = new SingletonEager();

    //Criar um construtor privado
    public SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}
