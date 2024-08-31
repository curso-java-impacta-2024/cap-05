package br.com.impacta.oo.zoo;

import br.com.impacta.oo.base.Animal;

public class Cachorro extends Animal{
	//aqui e um exemplo de heranca
	
	private String nome;
	
	
	public String setNome(String nome) {
		return this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	
	// aqui vou herdar os metodos mas vou muda-los, usando o polimorfismo
	
	//@Override //comentando a anotacao para usar o metodo original
	public void emitirSom() {
		System.out.println("Au au!");
	}
	
	@Override
	public void locomover() {
		System.out.println("correndo!");
	}

	@Override
	public boolean alimentar(String food) {
		System.out.println("Cachorro alimentado!");
		return true;
	}
}
