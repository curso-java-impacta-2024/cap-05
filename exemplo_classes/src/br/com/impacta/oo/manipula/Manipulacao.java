package br.com.impacta.oo.manipula;

import br.com.impacta.oo.base.Animal;
import br.com.impacta.oo.zoo.Cachorro;

public class Manipulacao {

	public static void main(String[] args) {
		
		
		Animal animal = new Animal();
		
		
		Cachorro cachorro = new Cachorro();
		
		cachorro.setEspecie("Canideo");
		cachorro.setGenero('f');
		cachorro.setPeso(5);
		cachorro.setTamanho(50);
		cachorro.setTipo("Shitzu");
		cachorro.setNome("Nina");
		
		System.out.println("Esp�cie : " + cachorro.getEspecie());        //true    false
		System.out.println("Gen�ro : " + (cachorro.getGenero() == 'f' ? "F�mea": "Macho" ));
		System.out.println("Peso : " + cachorro.getPeso());
		System.out.println("Tamanho : " + cachorro.getTamanho());
		System.out.println("Ra�a : " + cachorro.getEspecie());
		System.out.println("Nome : " + cachorro.getNome());
		
		
		

	}

}
