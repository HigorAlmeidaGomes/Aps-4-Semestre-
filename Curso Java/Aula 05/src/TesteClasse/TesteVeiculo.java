package TesteClasse;

import Heranca_veiculo.Aviao;
import Heranca_veiculo.Barco;
import Heranca_veiculo.Veiculo;
import Veiculo.Carro;

public class TesteVeiculo {
	public static void main(String[] args) {
		/*
		 * Carro corsa = new Carro("Vermelho", 2010, "PQ0711","Sedan"); corsa.mover();
		 * 
		 * Aviao aviao = new Aviao("Branco", 1999, "Boing"); aviao.mover();
		 * 
		 * Barco barco = new Barco("Preto",2018, "BRY855"); barco.mover();
		 */

		Veiculo veiculo = new Carro("Preto", 2018, "Sedam", "Corsa");
		Aviao aviao = new Aviao("Branco", 1999, "Boing");
		Barco barco = new Barco("Preto", 2018, "BRY855");
		testarPolimorfismo(veiculo);
		testarPolimorfismo(barco);
		testarPolimorfismo(aviao);

	}

	public static void testarPolimorfismo(Veiculo veiculo) {
		veiculo.mover();

	}

}
