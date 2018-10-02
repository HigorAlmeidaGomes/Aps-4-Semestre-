import java.util.Scanner;

import javax.swing.JOptionPane;

public class RestodaDivisao {
	public static void main(String[] args) {

	

		System.out.println(testeDivisao());
		System.out.println(testeEstacao());
		System.out.println(mediaEscola());
		System.out.println(mostrarMaiorValor());
	    System.out.println(Scanner());

	}

	public static String testeDivisao() {
		int a = 2;
		int b = 2;
		if (a % b == 0) {
			return "Par";
		} else {
			return "Impar";
		}
	}

	public static String testeEstacao() {
		int mesDoano = 13;
		if (mesDoano == 12 || mesDoano == 1 || mesDoano == 2) {
			return "Verão";
		} else if (mesDoano == 3 || mesDoano == 4 || mesDoano == 5) {
			return "Outono";
		} else if (mesDoano == 6 || mesDoano == 7 || mesDoano == 8) {
			return "Inverno";
		} else if (mesDoano == 9 || mesDoano == 10 || mesDoano == 1) {
			return "primavera";
		} else {
			return "Mês não e válido" + mesDoano;
		}
	}

	public static String mediaEscola() {
		double n1 = 5.5;
		double n2 = 5.5;
		double n3 = 5.3;
		double n4 = 4.8;
		double media;
		media = (n1 + n2 + n3 + n4) / 4;

		if (media > 6) {
			return "Aprovado";
		} else if (media < 6 && media >= 5) {
			return "Recuperação";
		} else {
			return "Reprovado";
		}
	}

	public static String mostrarMaiorValor() {
		int var1 = 18;
		int var2 = 11;
		int var3 = 9;

		if (var1 > var2 && var1 > var3) {
			return "Valor é maior " + var1;
		} else if (var1 < var2 && var1 < var3) {
			return "Valor" + var1 + var2;
		} else if (var3 > var2 && var1 < var3) {
			return "Valor" + var3;
		} else {
			return "Valor";
		}
	}

	public static String Scanner() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o número");
		int numero1 = scanner.nextInt();
		System.out.print("Digite o número");
		int numero2 = scanner.nextInt();
		int soma = (numero1 + numero2);

		return "A Soma é " + soma;
	}

}
