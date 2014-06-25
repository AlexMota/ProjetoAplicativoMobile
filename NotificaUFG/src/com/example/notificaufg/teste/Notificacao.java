package com.example.notificaufg.teste;

import java.io.Serializable;

public class Notificacao {

	private String remetente, data, conteudo;
	private int id;
	private static int countId = 0;
	public Notificacao(String remetente, String conteudo, String data) {
		super();
		this.remetente = remetente;
		this.conteudo = conteudo;
		this.data = data;
		countId++;
		this.id = countId;
	}

	public String getRemetente() {
		return remetente;
	}

	public void setRemetente(String remetente) {
		this.remetente = remetente;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
}
