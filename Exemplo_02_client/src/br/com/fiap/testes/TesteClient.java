package br.com.fiap.testes;

import java.rmi.RemoteException;
import java.util.List;

import br.com.fiap.exemplos.PrimeiroPortTypeProxy;
import br.com.fiap.exemplos.xsd.Aluno;

public class TesteClient {
	private static PrimeiroPortTypeProxy ws;
	
	public static void main(String[] args) {
		ws = new PrimeiroPortTypeProxy();
		
//		inserir();
		listar();
	}
	
	private static void listar() {
		Aluno[] alunos = null;
		try {
			alunos = ws.listar();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		for (Aluno aluno : alunos) {
			System.out.println(aluno.getNome());
		}
		
		
		
	}

	private static void inserir() {
		Aluno aluno = new Aluno();
		
		aluno.setNome("Lonchas da Silva");
		aluno.setMedia("10");
		aluno.setTurma("EJB");

		
		
		try {
			System.out.println(ws.novo(aluno));
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

}
