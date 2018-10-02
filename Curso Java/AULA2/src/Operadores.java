
public class Operadores {
	public static void main(String[]args) {
		
		Integer nota1 = 8;
		Integer nota2 = 10;
		Integer media;
		String nome = "Higor";
		String sobrenome = "Almeida Gomes";
		String turma = "CC6A";
		Boolean var1 = true;
		Boolean var2 = false;
		
		//media = nota1*nota2;
		//media = nota1+nota2;
		//media = nota1-nota2;
		// media = nota1%nota2;
		 media = (nota1+nota2)/ 2;
		
		  
		 System.out.println("O Aluno: "+nome+" "+sobrenome+" da turma: "+turma+" Teve Sua Media: "+media+"\n");
		 // Operador Relacional de Maior
		 System.out.println(nota1 > nota2);
		 // Operador Relacional de Maior ou Igual
		 System.out.println(nota1 >= nota2);
		 // Operador Relacional de Menor
		 System.out.println(nota1 < nota2);
		// Operador Relacional de Menor ou igual
		 System.out.println(nota1 <= nota2);
		// Operador Relacional de Igual
		 System.out.println(nota1 == nota2);
		// Operador Relacional de Diferente
		 System.out.println(nota1 != nota2);
		 System.out.println("\n");
		 
		 System.out.println(var1 +" &&"+" E Logioco AND"+ var2);
		 System.out.println(var1 +" & "+" E Binario"+ var2);
		 System.out.println(var1 +" || "+" OU Logico OR"+ var2);
		 System.out.println(var1 +" | "+ " OU Binario "+var2);
		 System.out.println(var1 +" ^ "+ " OU Exclusivo Binário"+var2);
		 System.out.println(" ! "+var2+" Negação ");
	}

}
