package Strategy;

public class Robo {
    //Estratégia de comportamento para o Robo
    private Comportamento comportamento;

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public  void mover(){
        comportamento.mover();
    }
}
