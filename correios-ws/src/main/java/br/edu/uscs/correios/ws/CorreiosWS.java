package br.edu.uscs.correios.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import br.edu.uscs.correios.ws.database.CorreiosDataBase;
import br.edu.uscs.correios.ws.domain.Endereco;



@WebService
public class CorreiosWS {


	private CorreiosDataBase correiosDataBase = new CorreiosDataBase();
	
	
	@WebMethod
	public Endereco consultarEndereco(String cep){
		return correiosDataBase.consultarEndereco(cep);
		
	}

}
