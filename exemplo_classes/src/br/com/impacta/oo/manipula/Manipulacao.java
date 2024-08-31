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
		
		System.out.println("Espécie : " + cachorro.getEspecie());        //true    false
		System.out.println("Genêro : " + (cachorro.getGenero() == 'f' ? "Fêmea": "Macho" ));
		System.out.println("Peso : " + cachorro.getPeso());
		System.out.println("Tamanho : " + cachorro.getTamanho());
		System.out.println("Raça : " + cachorro.getEspecie());
		System.out.println("Nome : " + cachorro.getNome());
		
		
		

	}

}
