import java.util.Scanner;

public class DeclaracaoBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		breack();
	}

	public static void breack() {
		int contador;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Digite um número");
			contador = scanner.nextInt();
			if (contador == 10) {
				System.out.println("Break - (While-true) Digite Texto");
				break;
			}
			if (contador ==10) {
				System.out.println("Break - (While-true) Digite Texto");
				break;

			}
			System.out.println(contador);
			contador++;
		}
	}
}
