package br.com.fiap.client.test;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import br.com.fiap.client.Aluno;
import br.com.fiap.client.AlunoWeb;
import br.com.fiap.client.AlunoWebService;
import br.com.fiap.client.Exception_Exception;

public class TesteChamada {
	public static void main(String[] args) throws Exception_Exception {
		Aluno aluno = new Aluno();
		aluno.setMedia("4.5");
		aluno.setNome("Dunha da Silva Desktop");
		aluno.setTurma("27SCJ");
		
		
		AlunoWeb port = new AlunoWebService().getAlunoWebPort();
		
		Map<String, Object> reqCtx = ((BindingProvider) port).getRequestContext();
		Map<String, List<String>> headers =  new HashMap<>();
		headers.put("Username", Collections.singletonList("vagner"));
		headers.put("Password", Collections.singletonList("123"));
		
		reqCtx.put(MessageContext.HTTP_REQUEST_HEADERS, headers);
		
		System.out.println(port.insert(aluno));
		
	}

}
