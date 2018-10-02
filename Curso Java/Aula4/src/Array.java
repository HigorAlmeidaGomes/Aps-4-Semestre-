import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// testearray();
		// testearray2();
		// testearray3();
		// escreverlaco();
		// impar();
		
	}

	public static void testearray() {
		int[] array = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120 };
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		System.out.println(array[5]);

		for (int i = 0; i < array.length; i++) {
			array[i] = i * (i + 1);
			System.out.println(array[i]);
		}
		for (int i : array) {
			System.out.println(i);
		}
	}

	public static void testearray2() {
		String array[] = new String[4];
		array[0] = "Posição 0";
		array[1] = "Posição 1";
		array[2] = "Posição 2";
		array[3] = "Posição 3";

		String array2[] = { "Posição 0", "Posição1", "Posição2", "Posição3", "Posição" + "4" };
		for (String posicao : array) {
			System.out.println("Posição do meu primeiro array é " + posicao);
		}

		for (String posicao : array2) {
			System.out.println("Posição do array é " + posicao);
		}
	}

	public static void testearray3() {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public static void testearray4() {
		int li = 5;
		double array[] = new double[li];
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < li; i++) {
			System.out.println("Informe o valor");
			array[i] = scanner.nextDouble();
		}

		for (double posicao : array) {
			System.out.println(posicao);
		}

	}

	public static void testearray5() {
		int[] array = { 1, 2, 3, 4, 5, -1, -2, -3, -4, -5 };
		int contador = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				System.out.println(array[i] + " Quantidade de valores encontrado  posição do array" + contador);
				contador++;

			}
		}
	}

	public static void testearray6() {
		int[] array = { 1, 2, 3, 4, 5, -1, -2, -3, -4, -5 };

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				array[i] = 1;
			} else {
				array[i] = -1;
				System.out.println("Valor posição " + i + " -" + array[i]);
			}
		}
	}

}
