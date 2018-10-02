package PacoteCarro;

public class Carro {
	public int ano;
	public String cor;
	public String modelo;
	public String placa;
	boolean ligado = true;

	static int contador;

	public Carro() {
		contador++;
		System.out.println("Criando objeto carro");
	}
	/*
	 * public Carro(String placa) { this.placa = placa; }
	 * 
	 * public Carro(String modelo, String placa) { this.placa = placa; this.modelo =
	 * modelo; }
	 * 
	 * public Carro(String modelo, String cor, int ano, String placa) { this(placa,
	 * modelo); this.cor = cor; this.ano = ano;
	 * 
	 * }
	 * 
	 * public void print(String msg) { System.out.println(msg);
	 * System.out.println("Carro de placa " + placa); System.out.println("Cor " +
	 * cor); System.out.println("Modelo " + modelo); System.out.println("Ano " +
	 * ano); }
	 * 
	 * public void print() { System.out.println("Carro de placa " + placa);
	 * System.out.println("Cor " + cor); System.out.println("Modelo " + modelo);
	 * System.out.println("Ano " + ano); }
	 */

	public String ligar() {
		String retorno = "";
		if (ligado == false) {
			ligado = true;
			retorno = "Ligando o carro: ";

		} else {
			retorno = "O carro já está ligado";
		}
		return retorno;

	}

	public String frear() {
		return "Parando";
	}

	public String acelerar() {
		return "acalerando";
	}

	public String velocidade(String velocidade) {
		velocidade = "50";
		return velocidade;
	}

	public String multa(String multa) {
		multa = "Dirigir Falando ao telefone";
		return multa;
	}

	public static int getContadorInstancia() {
		return contador;
	}
}
