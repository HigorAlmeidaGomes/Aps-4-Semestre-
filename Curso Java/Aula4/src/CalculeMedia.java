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
		System.out.print("Informe o Primeiro Número: ");
		n1 = scanner.nextInt();
		System.out.print("Informe o Segundo Número: ");
		n2 = scanner.nextInt();
		System.out.print("Informe o terceiro Numéro: ");
		n3 = scanner.nextInt();
		System.out.print("Informe o Quarto Numéro: ");
		n4 = scanner.nextInt();
		System.out.print("Informe o Quinto Numéro: ");
		n5 = scanner.nextInt();
		System.out.print("Informe o Sexto Numéro: ");
		n6 = scanner.nextInt();

		int media = (n1 + n2 + n3 + n4 + n5 + n6) / 6;

		System.out.println("A media dos números calculados são " + media);
	}

	public static void formedia() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		double soma = 0;

		System.out.println("Insira 6 números");
		for (int i = 0; i < 6; i++) {
			soma += scanner.nextDouble();
		}
		double media = soma / 6;
		System.out.println("Sua Média é " + media);
	}
}
