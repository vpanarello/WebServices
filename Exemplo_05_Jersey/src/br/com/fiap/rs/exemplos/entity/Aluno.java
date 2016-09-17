package br.com.fiap.rs.exemplos.entity;

import javax.xml.bind.annotation.XmlRootElement;

// Notacao de bind, permite bean ser serializado como xml
@XmlRootElement
public class Aluno {
	
	private String nome;
	private String turma;
	private String media;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
	public String getMedia() {
		return media;
	}
	public void setMedia(String media) {
		this.media = media;
	}
	
	

}
