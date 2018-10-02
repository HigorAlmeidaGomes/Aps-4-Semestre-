package PacoteTeste;

import PacoteCarro.Carro;

public class TestarCarro {
	public static void main(String[] args) {
		Carro vw = new Carro();
		vw.cor = "Prata";
		vw.ano = 2015;
		vw.placa = "PQO0711";
		vw.modelo = "Voyage-Itrend";
		System.out.println("Ano do veiculo " + vw.ano);
		System.out.println("Placa do veiculo " + vw.placa);
		System.out.println("Modelo " + vw.modelo);
		System.out.println("Cor do veiculo  " + vw.cor);
		System.out.println("Foi Multado por " + vw.multa("Multa"));
		System.out.println(vw.ligar());
		System.out.println(vw.frear());
		System.out.println(Carro.getContadorInstancia());

		System.out.println("-------------------------------------------------");

		Carro honda = new Carro();
		honda.cor = "Cinza";
		honda.ano = 2018;
		honda.placa = "PRY6825";
		honda.modelo = "City EX";

		System.out.println("Ano do seu veiculo " + honda.ano);
		System.out.println("Placa do veiculo " + honda.placa);
		System.out.println("Modelo " + honda.modelo);
		System.out.println("Cor do veiculo " + honda.cor + honda.velocidade("velocidade"));
		System.out.println(honda.ligar());
		System.out.println(honda.frear());
		System.out.println(Carro.getContadorInstancia());

		System.out.println("-------------------------------------------------");

		Carro volvo = new Carro();
		volvo.cor = "Vermelho";
		volvo.ano = 2018;
		volvo.placa = "PRT6825";
		volvo.modelo = "CX60";

		System.out.println("Ano do seu veiculo " + volvo.ano);
		System.out.println("Placa do veiculo " + volvo.placa);
		System.out.println("Modelo " + volvo.modelo);
		System.out.println("Cor do veiculo " + volvo.cor + volvo.velocidade("velocidade"));
		System.out.println(Carro.getContadorInstancia());

		System.out.println("-------------------------------------------------");

		Carro fiat = new Carro();
		fiat.cor = "Preto";
		fiat.ano = 2018;
		fiat.placa = "PRY8725";
		fiat.modelo = "UNO";

		System.out.println("Ano do seu veiculo " + fiat.ano);
		System.out.println("Placa do veiculo " + fiat.placa);
		System.out.println("Modelo " + fiat.modelo);
		System.out.println("Cor do veiculo " + fiat.cor);
		System.out.println( fiat.velocidade("velocidade"));
		System.out.println(Carro.getContadorInstancia());

		System.out.println("-------------------------------------------------");

	}

}
