import javax.swing.JOptionPane;
import javax.xml.soap.Text;

public class OperadorIncrementoeDecremento {
     public static void main(String[]args) {
    	 
    	 
    	 int varInt = 1;
    	 boolean teste = true;
    	 String texto;
    	 int idade = 17;
    	
    	
    	 System.out.println("++"+(varInt+2));
    	 System.out.println("++"+(++varInt));
    	 System.out.println("++"+(varInt--));
    	 System.out.println("++"+(--varInt));
    	 
    	// texto = teste ? " Verdadeiro " : "Falso";
         //System.out.println(texto);
         
         System.out.println(idade >=18 ? testeMaior(): testeMenor());
    	 
      } 
     
       public static String testeMaior() {

    	 return ("Maior de Idade");
    	   
       }
        public static String testeMenor() {
        	return("Menor de Idade");
        }
  
}
