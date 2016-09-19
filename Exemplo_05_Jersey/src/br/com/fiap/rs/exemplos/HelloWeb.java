package br.com.fiap.rs.exemplos;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

// Nome especificado do recurso "exemplo"
@Path("exemplo")
public class HelloWeb {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Response hello() {
		return Response.status(Response.Status.OK).entity("Deu certo").build();
	}
}
