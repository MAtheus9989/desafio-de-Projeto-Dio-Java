package Facade;

import subssistema1.crm.CrmService;
import subssistema2.cep.CepApi;

public class Facade {
	
	public void migraCliente(String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		
		CrmService.gravarCliente(nome, cep, cidade, estado);
	}
}
