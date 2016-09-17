package com.fiap.exemplos.ws;



import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;


@WebService
public class AlunoWeb {
	
	protected final String AUTH_FAILURE_MSG = "Falha de Autenticação";
	public List<Aluno> alunos;
	
	@Resource
	WebServiceContext wsctx;
	
	public AlunoWeb() {
		alunos = new ArrayList<>();
	}
	
	@WebMethod(exclude=true)
	public boolean isAuthenticatedWith(String usuario, String senha){
		if(usuario.toLowerCase().equals("vagner") &&
				senha.toLowerCase().equals("123")
				) {
			return true;
		} else {
			return false;
		}
	}
	
	
	@SuppressWarnings("rawtypes")
	public boolean isAuthenticated(){
		MessageContext mctx = wsctx.getMessageContext();
		Map<?,?> httpHeaders = (Map) mctx.get(MessageContext.HTTP_REQUEST_HEADERS);
		List usuarios = (List) httpHeaders.get("Username");
		List senhas = (List) httpHeaders.get("Password");
		
		String usuario = "";
		String senha = "";
		
		
		if(usuarios!=null) usuario = usuarios.get(0).toString();
		if(senhas!=null) senha = senhas.get(0).toString();
		
		if(usuario.toLowerCase().equals("vagner") &&
				senha.toLowerCase().equals("123")
				) {
			return true;
		} else {
			return false;
		}
	}
	
	@WebMethod
	public String insert(
			@WebParam(name = "aluno", header=false) Aluno aluno,
			@WebParam(name = "Username", header=true) String usuario,
			@WebParam(name = "Password", header=true) String senha
			) throws Exception {
		if (isAuthenticatedWith(usuario,senha)) {
			alunos.add(aluno);
			return "Aluno cadastrado com sucesso!";
		} else {
			throw new Exception(AUTH_FAILURE_MSG);
		}
	}
	
	@WebMethod
	public List<Aluno> listAlunos(
			@WebParam(name = "Username", header=true) String usuario,
			@WebParam(name = "Password", header=true) String senha
			) throws Exception {
		if(isAuthenticatedWith(usuario,senha)) return this.alunos;
		else throw new Exception(AUTH_FAILURE_MSG);
	}
	
	@WebMethod
	public String hello(String name) {
		return "Hello " + name;
	}

}
