import java.io.Console;
import java.util.Scanner;

public class ComparacaoString {
	public static void main(String[] args) {
		String sexo;
		boolean continuar = true;

		do {
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			System.out.print("Infome o sexo");
			sexo = scanner.nextLine().toUpperCase().trim();

			if (sexo.equals("M")) {
				System.out.println("Masculino");
			} else if (sexo.equals("F")) {
				System.out.println("Feminino");
			} else if (sexo.equals("S")) {
				System.out.println("Tchaul");
				continuar = false;
			} else {
				System.out.println("Infome o Sexo Correto!");
			}

		} while (continuar);

	}

}
