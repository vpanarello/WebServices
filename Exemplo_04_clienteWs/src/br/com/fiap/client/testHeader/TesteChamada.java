package br.com.fiap.client.testHeader;

import br.com.fiap.clientHeader.AlunoWebService;
import br.com.fiap.clientHeader.Exception_Exception;
import br.com.fiap.clientHeader.Insert;
import br.com.fiap.clientHeader.InsertResponse;
import br.com.fiap.clientHeader.Aluno;
import br.com.fiap.clientHeader.AlunoWeb;

public class TesteChamada {
	
	public static void main(String[] args) {
		create();
		
	}
	
	private static void create() {
		Aluno a = new Aluno();
		a.setNome("Osmar Contato");
		a.setTurma("27EJF");
		a.setMedia("5");
		
		AlunoWeb port =  new AlunoWebService().getAlunoWebPort();
		
		Insert parametros = new Insert();
		parametros.setAluno(a);
		
		InsertResponse resposta = null;
		try {
			resposta = port.insert(parametros, "vagner", "123");
		} catch (Exception_Exception e) {
			e.printStackTrace();
		}
		System.out.println(resposta.getReturn());
		
	}

}
