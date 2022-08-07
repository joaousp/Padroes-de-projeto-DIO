package dio.gof.Facade;

import dio.gof.subsistema1.crm.CrmService;
import dio.gof.subsistema2.cep.CepApi;

public class Facade {

    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);
        CrmService.GravarCliente(nome,cep,cidade,estado);

    }

}
