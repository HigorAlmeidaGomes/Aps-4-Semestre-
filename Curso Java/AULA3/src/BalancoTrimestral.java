
public class BalancoTrimestral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gastoJaneiro = 15000;
		int gastoFevereiro = 23000;
		int gastoMarco = 17000;
		int media;
		
		int gastoTrimestre = gastoJaneiro+gastoFevereiro+gastoMarco;
		media = gastoTrimestre/3;
		
		System.out.println("O seu Gasto Trimestral foi: "+gastoTrimestre);
		System.out.println(gastoTrimestre/3);
		
		if(media > 19000) {
			System.out.println("Você Passou do limite de Gasto:");
		}
		
		

	}

}
