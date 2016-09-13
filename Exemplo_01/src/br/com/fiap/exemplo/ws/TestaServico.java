package br.com.fiap.exemplo.ws;

import br.com.fiap.exemplo.ws.client.HelloWebService;

public class TestaServico {
	
	public static void main(String[] args) {
		HelloWeb port = (HelloWeb) new HelloWebService().getHelloWebPort();
		
		System.out.println(port.hello("Vagner"));
	}
	
	

}
