import java.util.Scanner;

public class ImprimirMesano {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe o m�s");
		String numeroDigitado = scanner.nextLine().trim();

		switch (numeroDigitado) {
		case "Um":
			System.out.println("Valor n�merico 1");
			break;
		case "Dois":
			System.out.println("Valor Numerico 2");
			break;
		case "Tres":
			System.out.println("Valor N�mero 3");
			break;
		case "Quatro":
			System.out.println("Valor N�mero 3");
			break;

		default:
			System.out.println("Valor Digitado Invalido" + numeroDigitado);
			break;
		}

	}

}
