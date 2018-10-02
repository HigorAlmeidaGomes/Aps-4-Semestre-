package Heranca_veiculo;

public class Barco extends Veiculo {

	public Barco(String cor, int ano, String identificacao) {
		super(cor, ano, identificacao);
	}

	@Override
	public void mover() {
		System.out.println("Está Afundando");
	}
}
