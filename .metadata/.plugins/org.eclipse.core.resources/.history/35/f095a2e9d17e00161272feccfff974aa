package br.com.fiap.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class TesteChamadaDelete {
	
	public static void main(String[] args) {
		
		
		Client client = ClientBuilder.newClient();
		WebTarget webTarget = 
				client.target("http://10.10.35.31:8080/ExemploJersey").path("alunos").path("2");
		
		Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_XML);
		
		
		Response response = invocationBuilder.delete();
		
		Retorno r = response.readEntity(Retorno.class);
		
		System.out.println(r.getMensagem());
		

		
		
	}

}
