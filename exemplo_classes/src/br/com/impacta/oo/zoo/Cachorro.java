package br.com.impacta.oo.zoo;

import br.com.impacta.oo.base.Animal;

public class Cachorro extends Animal{
	
	private String nome;
	
	public Cachorro() {
		
	}
	
	public String setNome(String nome) {
		return this.nome = nome;
	}
	public String getNome() {
		return nome;
	}

}
