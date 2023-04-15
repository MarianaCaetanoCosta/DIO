package Singleton;

/**
 * Singleton "preguiçoso".
 * @autor: Mariana Caetano Costa
 */
public class SingletonLazy {

    //No primeiro momento não disponibiliza a instância para o usuário
    private static SingletonLazy instancia;

    //Criar um construtor privado
    public SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia(){
        if (instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
