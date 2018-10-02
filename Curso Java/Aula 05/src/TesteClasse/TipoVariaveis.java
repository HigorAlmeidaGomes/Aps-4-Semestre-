package TesteClasse;

public class TipoVariaveis {
	static String staticVariable = "Variavel de classe, ou estatica";

	String instanceVariable = "Variavel de instancia";

	public static void main(String[] args) {

		TipoVariaveis tipovariaveis = new TipoVariaveis();

		String localVariable = "Variavel local";
		System.out.println("Variavel estatica" + staticVariable);
		System.out.println("Variavel de instancia = " + tipovariaveis.instanceVariable);
		System.out.println("Variavel local " + localVariable);
	}

}
