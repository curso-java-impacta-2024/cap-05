package br.com.impacta.oo.base;

public class Animal {
	
	
	private String tipo;
	private String especie;
	private int peso;
	private int tamanho;
	private char genero;
	
	public Animal() {
		
		
	}

	public Animal(String tipo, String especie, int peso, int tamanho, char genero) {
		super();
		this.tipo = tipo;
		this.especie = especie;
		this.peso = peso;
		this.tamanho = tamanho;
		this.genero = genero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}
	
	
	
	

}
