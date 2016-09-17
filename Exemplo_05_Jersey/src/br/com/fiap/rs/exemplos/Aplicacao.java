package br.com.fiap.rs.exemplos;
import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;


// Classe de configuração
@ApplicationPath("resources")
public class Aplicacao extends ResourceConfig{
	
	public Aplicacao() {
		//Especificar pacotes onde contem seus recursos
		packages("br.com.fiap.rs.exemplos");
		
	}
}
