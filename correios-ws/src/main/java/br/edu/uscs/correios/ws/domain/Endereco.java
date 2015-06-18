package br.edu.uscs.correios.ws.domain;

public class Endereco {

	private String cep;
	private String cidade;
	private String bairro;
	private String logradouro;
	

	
	public Endereco(String cep, String cidade, String bairro, String logradouro) {
		super();
		this.cep = cep;
		this.cidade = cidade;
		this.bairro = bairro;
		this.logradouro = logradouro;
	}


	
	
	public Endereco() {
	}




	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getLogradouro() {
		return logradouro;
	}


	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
}
