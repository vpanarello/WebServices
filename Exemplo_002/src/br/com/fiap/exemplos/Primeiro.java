package br.com.fiap.exemplos;

import java.util.ArrayList;
import java.util.List;

public class Primeiro {
	
	static private List<Aluno> alunos;
	
	static {
		alunos = new ArrayList<>();
	}
	
	public Primeiro() {
		super();
	}
	
	public String novo(Aluno aluno) {
		alunos.add(aluno);
		return "aluno inserido com sucesso";
	}
	
	public Aluno buscar(int index) {
		return alunos.get(index);
	}

	public List<Aluno> listar() {
		return alunos;
	}

	public String tchau(String nome) {
		return "tchau " + nome;
	}
	
	

}
