import java.util.Scanner;

public class Main {

	 public static void main(String[] args) {
	        Scanner leitor = new Scanner(System.in);
	        
	        int numAlunos = leitor.nextInt();
	        int numPc = leitor.nextInt();
	        int qtsPcsQuebrados = leitor.nextInt();
	        int qtsPcsSemComp = leitor.nextInt();
	        
	        int numPcBom = numPc - qtsPcsQuebrados;
	        numPcBom -= 1;
	        
	        int metade = qtsPcsSemComp/2;
	        
	        if (numPcBom < numAlunos) {
	            
	            System.out.println("Igor bolado!");

	             } else {
	                 if (qtsPcsQuebrados > metade)
	                     System.out.println("Caio, a culpa eh sua!");
	                 else
	                     System.out.println("Igor feliz!");
	             }
	    }
	
}
