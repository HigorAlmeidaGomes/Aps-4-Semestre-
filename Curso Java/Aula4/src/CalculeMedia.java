import java.util.Scanner;

public class CalculeMedia {

	public static void main(String[] args) {
		// media();
		formedia();

	}

	public static void media() {
		int n1;
		int n2;
		int n3;
		int n4;
		int n5;
		int n6;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe o Primeiro N�mero: ");
		n1 = scanner.nextInt();
		System.out.print("Informe o Segundo N�mero: ");
		n2 = scanner.nextInt();
		System.out.print("Informe o terceiro Num�ro: ");
		n3 = scanner.nextInt();
		System.out.print("Informe o Quarto Num�ro: ");
		n4 = scanner.nextInt();
		System.out.print("Informe o Quinto Num�ro: ");
		n5 = scanner.nextInt();
		System.out.print("Informe o Sexto Num�ro: ");
		n6 = scanner.nextInt();

		int media = (n1 + n2 + n3 + n4 + n5 + n6) / 6;

		System.out.println("A media dos n�meros calculados s�o " + media);
	}

	public static void formedia() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		double soma = 0;

		System.out.println("Insira 6 n�meros");
		for (int i = 0; i < 6; i++) {
			soma += scanner.nextDouble();
		}
		double media = soma / 6;
		System.out.println("Sua M�dia � " + media);
	}
}
