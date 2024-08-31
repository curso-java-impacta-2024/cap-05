package br.com.impacta.oo.zoo;

import br.com.impacta.oo.base.Animal;

public class Cachorro extends Animal{
	
	private String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Latindo");
	}
	
	@Override
	public void locomover() {
		System.out.println("Correndo!!");
	}
	
	@Override
	public boolean alimentar(String food) {
		System.out.println("Foi alimentado");
		return true;
	}
}
