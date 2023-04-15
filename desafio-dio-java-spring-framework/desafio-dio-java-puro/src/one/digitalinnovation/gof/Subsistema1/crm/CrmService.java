package one.digitalinnovation.gof.Subsistema1.crm;

public class CrmService {
    private CrmService() {
        super();
    }

    public static void gravarCliente(String nome, String cep, String estado, String cidade){
        System.out.println("Cliente salvo no sistema CRM.");
        System.out.println("nome: " + nome);
        System.out.println("cep: " + cep);
        System.out.println("cidade: " + cidade);
        System.out.println("estado: " + estado);
    }
}
