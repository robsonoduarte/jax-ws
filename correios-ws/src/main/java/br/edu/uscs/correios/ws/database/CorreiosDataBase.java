package br.edu.uscs.correios.ws.database;

import java.util.HashMap;
import java.util.Map;

import br.edu.uscs.correios.ws.domain.Endereco;

public class CorreiosDataBase {

	private Map<String, Endereco> databaseEnderecos = new HashMap<>();

	
	
	public CorreiosDataBase() {
		carregarEnderecos();
	}

	
	
	
	public Endereco consultarEndereco(String cep){
		return databaseEnderecos.get(cep);
	}
	
	
	
	
	
	
	
	private void carregarEnderecos() {		
		databaseEnderecos.put("03589070", new Endereco("03589070", "Sao Paulo", "Aricanduva", "Av. Aricanduva"));
		databaseEnderecos.put("20008980", new Endereco("20008980", "Sao Paulo", "Bela Vista", "Av. Paulista"));
	}
	
	
	
}
