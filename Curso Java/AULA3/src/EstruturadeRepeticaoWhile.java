
public class EstruturadeRepeticaoWhile {

	public static void main(String[] args) {

		int contador = 1;
		int decremento = 110;
		while (contador < 95 && decremento > 95) {
			// System.out.println(contador + "<-------->" + decremento);
			contador++;
			decremento--;

		}

		//impar();
		//dowhile();
		estruturafor();
	}

	public static void impar() {
		int contador = 0;
		while (contador <= 100) {
			System.out.println("-");
			if (contador % 2 == 0) {
				System.out.println("Metodo Impar " + contador);
			}
			contador++;
		}
	}

	public static void dowhile() {
		int contador = 0; // contador vai inicializar com
		String nome = "Higor"; // no do while ele primeiro verificar o corpo da execução para depois verificar
		do {
			System.out.println("-");
			if (contador % 2 == 0) {
				System.out.println("Metodo dowhile" + contador);
				nome = nome + "Almeida";
			}
			contador++;
		} while (contador <= 100);
	}

	public static void estruturafor() {
		for (Integer contador = 0; contador < 100; contador++) {
			if (contador % 2 == 0) {
				System.out.println("--");
				System.out.println("Par" + contador);
			}else if(contador % 2 !=0) {
				System.out.println("--");
				System.out.println("Impar "+contador);
			}
		}
	}
}
