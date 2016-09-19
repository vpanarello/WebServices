package br.com.fiap.rs.exemplos;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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
	@Produces(MediaType.APPLICATION_XML)
	public List<Aluno> getAlunos() {
		return AlunoWeb.alunos;
	}
	
	@GET
	@Path("{index}")
	@Produces(MediaType.APPLICATION_XML)
	public Aluno getAluno(@PathParam("index") int index){
		return alunos.get(index);
	}
	
	@POST
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_XML)
	public Retorno novo(Aluno a) {
		alunos.add(a);
		Retorno r = new Retorno();
		r.setMensagem("Aluno cadastrado com sucesso!");
		return r;
	}
	
	@DELETE
	@Path("{index}")
	@Produces(MediaType.APPLICATION_XML)
	public Retorno remover(@PathParam("index") int index) {
		alunos.remove(index);
		Retorno r = new Retorno();
		r.setMensagem("Aluno removido com sucesso!");
		return r;
		
	}
	
	@PUT
	@Path("{index}")
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_XML)
	public Retorno atualizar(Aluno aluno, @PathParam("index") int index) {
		alunos.set(index, aluno);
		Retorno r = new Retorno();
		r.setMensagem("Aluno atualizado com sucesso!");
		return r;
	}

}
