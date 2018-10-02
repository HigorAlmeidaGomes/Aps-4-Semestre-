package Veiculo;

import Heranca_veiculo.Veiculo;

public class Carro extends Veiculo {

	@SuppressWarnings("unused")
	private String modelo;

	public Carro(String cor, int ano, String identificacao, String modelo) {
		super(cor, ano, identificacao);
		this.modelo = modelo;
		System.out.println("Criando Objeto Carro");
	}

	@Override
	public void mover() {
		System.out.println("Correr");
	}

}
