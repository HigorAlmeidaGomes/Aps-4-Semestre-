package Mamifero;

import Animal.Animal;

public class TesteMamifero {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.emitirSom();

		Gato gato = new Gato();
		gato.emitirSom();

		Cao cao = new Cao();
		cao.emitirSom();

	}
}
