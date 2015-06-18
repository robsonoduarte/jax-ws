package br.edu.uscs.cadastroaluno.service;

import br.com.correiows.client.CorreiosWS;
import br.com.correiows.client.CorreiosWSService;
import br.edu.uscs.cadastroaluno.domain.Endereco;

public class CorreioService {

	
	public Endereco consultarEndereco(String cep){
		
		
		CorreiosWSService correiosWSService = new CorreiosWSService();
		CorreiosWS correiosWSPort = correiosWSService.getCorreiosWSPort();
		br.com.correiows.client.Endereco enderecoWS = correiosWSPort.consultarEndereco(cep);
		
		
		Endereco endereco = new Endereco();
		
		endereco.setCep(enderecoWS.getCep());
		endereco.setCidade(enderecoWS.getCidade());
		endereco.setBairro(enderecoWS.getBairro());
		endereco.setLogradouro(enderecoWS.getLogradouro());
		
		return endereco;
	}
}
