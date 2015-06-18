package br.edu.uscs.cadastroaluno.controller;

import javax.faces.bean.ManagedBean;

import br.edu.uscs.cadastroaluno.domain.Aluno;
import br.edu.uscs.cadastroaluno.domain.Endereco;
import br.edu.uscs.cadastroaluno.service.CorreioService;

@ManagedBean
public class CadastroAlunoController {

	
	
	private CorreioService correioService = new CorreioService();
	
	
	private Aluno aluno = new Aluno();

	
	
	
	public void consultarEnderecoNoCorreio(){
		Endereco endereco = correioService.consultarEndereco(aluno.getEndereco().getCep());
		aluno.setEndereco(endereco);
	}
	
	
	
	
	
	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	

}
