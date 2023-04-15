import one.digitalinnovation.gof.SingletonLazy;
import one.digitalinnovation.gof.SingletonEager;
import one.digitalinnovation.gof.SingletonLazyHolder;

public class Main {
    public static void main(String[] args) {

        //Desing Pattern Singleton
        SingletonLazy lazy = new SingletonLazy().getInstancia();
        System.out.println("lazy: " + lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println("lazy: " + lazy);
        System.out.println();

        SingletonEager eager = new SingletonEager().getInstancia();
        System.out.println("eager: " + eager);
        eager = SingletonEager.getInstancia();
        System.out.println("eager: " + eager);
        System.out.println();

        SingletonLazyHolder lazyholder = new SingletonLazyHolder().getInstancia();
        System.out.println("lazyholder: " + lazyholder);
        lazyholder = SingletonLazyHolder.getInstancia();
        System.out.println("lazyholder: " + lazyholder);
    }
}