
public class ParametroPrimitivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// criar um array de inteiros
		int[] idades = { 1, 2, 3 };
		// Exibir os valores do array
		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
		// chamar o métodos teste e enviar
		// referência para o array
		teste(idades);

		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
	}

	public static void teste(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 50;
		}
	}

}
