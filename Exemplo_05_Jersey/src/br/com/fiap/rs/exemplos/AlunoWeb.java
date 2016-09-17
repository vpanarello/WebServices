package br.com.fiap.rs.exemplos;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.fiap.rs.exemplos.entity.Aluno;

@Path("alunos")
public class AlunoWeb {
	
	static private List<Aluno> alunos;
	
	static {
		alunos = new ArrayList<Aluno>();
		Aluno a = new Aluno();
		a.setNome("Pablo Emilio Escobar Gaviria");
		a.setTurma("27AJB");
		a.setMedia("9,8");
		alunos.add(a);
	}
	
	@GET
	// modifique "mediatype" para escolher formato de resposta
	@Produces(MediaType.APPLICATION_JSON)
	public List<Aluno> getAlunos() {
		return AlunoWeb.alunos;
	}

}
