import one.digitalinnovation.gof.Facade.*;
import one.digitalinnovation.gof.Singleton.*;
import one.digitalinnovation.gof.Strategy.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("* Desing Pattern Singleton\n");

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

        System.out.println("------------");

        System.out.println("* Desing Pattern Strategy\n");

        Comportamento normal = new ComportamentoNormal();
        Comportamento defencivo = new ComportamentoDefencivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defencivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        System.out.println("------------");

        System.out.println("* Desing Pattern Facede\n");
        Facade facade = new Facade();
        facade.migrarCliente("Mariana", "31456-789");
    }
}