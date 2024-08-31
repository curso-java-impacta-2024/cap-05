package br.com.impacta.oo.manipulacao;

import br.com.impacta.oo.base.Animal;
import br.com.impacta.oo.zoo.Cachorro;

public class Manipulacao {

	public static void main(String[] args) {
		
		Animal animal = new Animal();

		System.out.println(animal);
		
		Cachorro cachorro = new Cachorro();
		cachorro.setEspecie("canideo");
		cachorro.setGenero('F');
		cachorro.setPeso(5);
		cachorro.setTamanho(50);
		cachorro.setTipo("shitzu");
		cachorro.setNome("Januario");
		
		System.out.println("Especie do meu cachorro  " + cachorro.getEspecie());
		System.out.println("Genero do meu cachorro " + (cachorro.getGenero() == 'F' ? "femea" : "macho" ));
		System.out.println("Peso do meu cachorro " + cachorro.getPeso());
		System.out.println("Tamanho do meu cachorro " + cachorro.getTamanho());
		System.out.println("Tipo do meu cachorro " + cachorro.getTipo());
		System.out.println("Nome do meu cachorro " + cachorro.getNome());
	}

}
