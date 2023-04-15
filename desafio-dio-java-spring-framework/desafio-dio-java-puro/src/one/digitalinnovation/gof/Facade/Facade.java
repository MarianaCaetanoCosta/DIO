package one.digitalinnovation.gof.Facade;

import one.digitalinnovation.gof.Subsistema1.crm.CrmService;
import one.digitalinnovation.gof.Subsistema2.cep.CepApi;

public class Facade {
    //Interface para realizar operações, consolidar ou expor.

    /* Problema:
      - Base de cliente e deseja fazer uma migração para uma nova base.
      - Contem nome e cep.
      - Vai consumir uma api de cep e consolide as informações de cep (logradouro, cidade, etc)
     */

    public void migrarCliente(String nome, String cep){

        //Recuperar cidade e estado
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
