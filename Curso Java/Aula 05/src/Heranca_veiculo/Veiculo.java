package Heranca_veiculo;

public class Veiculo {
	private String cor;
	private int ano;
	private String identificacao;

	public Veiculo(String cor, int ano, String identificacao) {
		this.cor = cor;
		this.ano = ano;
		this.identificacao = identificacao;
		System.out.println("Criando Obejeto veiculo");
	}
	public void mover() {
		System.out.println("O veiculo se movendo");
	}
}
