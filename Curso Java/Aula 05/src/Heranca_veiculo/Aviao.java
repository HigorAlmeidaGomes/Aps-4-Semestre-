package Heranca_veiculo;

public class Aviao extends Veiculo {

	public Aviao(String cor, int ano, String identificacao) {
		super(cor, ano, identificacao);
	}

	@Override
	public void mover() {
		System.out.println("VOAR");
	}
}
