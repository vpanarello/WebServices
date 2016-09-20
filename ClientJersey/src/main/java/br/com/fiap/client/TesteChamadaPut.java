package br.com.fiap.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class TesteChamadaPut {
	
	public static void main(String[] args) {
		
		Aluno me = new Aluno(1.5, "Marcão Macedo", "charlata");
		
		Client client = ClientBuilder.newClient();
		WebTarget webTarget = 
				client.target("http://10.10.35.31:8080/ExemploJersey").path("alunos").path("0");
		Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_XML);
		Response response = invocationBuilder.put(Entity.entity(me, MediaType.APPLICATION_XML));
		Retorno r = response.readEntity(Retorno.class);
		
		System.out.println(r.getMensagem());
		

		
		
	}

}
