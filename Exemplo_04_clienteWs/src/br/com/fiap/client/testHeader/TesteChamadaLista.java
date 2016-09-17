package br.com.fiap.client.testHeader;

import java.util.List;

import br.com.fiap.clientHeader.Aluno;
import br.com.fiap.clientHeader.AlunoWeb;
import br.com.fiap.clientHeader.AlunoWebService;
import br.com.fiap.clientHeader.Exception_Exception;
import br.com.fiap.clientHeader.ListAlunos;
import br.com.fiap.clientHeader.ListAlunosResponse;

public class TesteChamadaLista {
	
	public static void main(String[] args) {
		list();
		
	}
	
	private static void list() {

		
		AlunoWeb port =  new AlunoWebService().getAlunoWebPort();
		
		ListAlunos parametros = new ListAlunos();
		

	
		ListAlunosResponse resposta = null;
		try {
			resposta = port.listAlunos(parametros, "vagner", "123");
		} catch (Exception_Exception e) {
			e.printStackTrace();
		}
		List<Aluno> alunos = resposta.getReturn();
		
		
		for (Aluno aluno : alunos) {
			System.out.println(aluno.getNome());
			System.out.println(aluno.getMedia());
			System.out.println(aluno.getTurma());
			System.out.println("");
		}
		
	}

}
