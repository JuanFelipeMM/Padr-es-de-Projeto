package Facade;

import subsistema1.CrmService;
import subsistema2.CepApi;

public class Facade {
    public void migrarcliente(String nome, String cep) {
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);
        CrmService.gravarcliente(nome, cep, cidade, estado);
    }
}
