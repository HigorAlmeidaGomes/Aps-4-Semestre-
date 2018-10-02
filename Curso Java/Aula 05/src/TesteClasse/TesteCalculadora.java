package TesteClasse;

import Calculadora.Calculadora;

public class TesteCalculadora {
	public static void main(String[] args) {

		/*
		 * Calculadora.multiplicar(140 , 1070); Calculadora.somar(1558 , 1050);
		 * Calculadora.dividir(104 , 10); Calculadora.subitrair(10, 5);
		 */

		/*
		 * System.out.println(Calculadora.multiplicar(10, 100));
		 * System.out.println(Calculadora.somar(10, 20));
		 * System.out.println(Calculadora.subitrair(1000, 100));
		 * System.out.println(Calculadora.dividir(10, 10));
		 */

		Calculadora c = new Calculadora();
		System.out.println(c.multiplicar(10, 100));
		System.out.println(c.somar(10, 20));
		System.out.println(c.subitrair(1000, 100));
		System.out.println(c.dividir(10, 10));

	}

}
