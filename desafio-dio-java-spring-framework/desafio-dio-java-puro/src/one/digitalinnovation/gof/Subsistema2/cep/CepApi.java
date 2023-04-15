package one.digitalinnovation.gof.Subsistema2.cep;

public class CepApi {
    //Implementação SingletonEager

    private static CepApi instancia = new CepApi();

    //Criar um construtor privado
    public CepApi() {
        super();
    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "Belo horizonte";
    }
    public String recuperarEstado(String cep){
        return "MG";
    }
}
