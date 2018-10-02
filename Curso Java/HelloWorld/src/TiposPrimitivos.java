import java.sql.Date;

public class TiposPrimitivos {
	public static void main(String[]args) {
		String nome = "Higor";
		String sobreNome = "Almeida Gomes";
		int meses =5;
		float idade = 23.5f;
		double dinheiro = 12.5d;
		byte memoria ='2';
		long numerolong = 912312345455l;
		short status  = 0;
		char teste = 't';
		boolean status2 = true;
		
		
		meses = (int) numerolong; 

		String testeString = "10";
		
		
		Integer testeConversao = Integer.parseInt(testeString);
		System.out.println(testeConversao);
     
		
		
		System.out.println("Seu nome é: "+nome+"e seu sobrenome e: "+ sobreNome + "Sua Idade é: "+idade+" E "+ meses + "Meses " + "e seu dinheiro é: "+dinheiro+" Você está Quebrado !!");
		System.out.println(memoria+ numerolong);
		System.out.println(status);
		System.out.println(teste);
		System.out.println(status2);
		

		
		
	     
	}

}
