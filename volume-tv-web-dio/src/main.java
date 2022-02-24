import java.io.IOException;
import java.util.Scanner;

public class main {

	 public static void main(String[] args) throws IOException {
	    	
	        Scanner leitor = new Scanner(System.in);
	        
	        int volumeInicial = leitor.nextInt();
	        int qtdOpe = leitor.nextInt();
	        int volAtual = 0;
	        int f = 0;
	        int cont = 0;
	        for(int i = 1;i<=qtdOpe;i++ ) {
	        	  System.out.println("DIGITE A "+i+"ª OPERACAO");
	        	  f = leitor.nextInt();
	        	  cont = volumeInicial;
	        	  if(f >= 0) {
	        		  if(volumeInicial >= 100) {
	        			  	volumeInicial = 100;
	        		  }else {
	        		  volAtual = volumeInicial + f;
	        		  volumeInicial = volAtual;
	        		  //System.out.println(volAtual);
	        		  }
	        	  }else{
	        		  if(volumeInicial <= -100) {
	        			  	volumeInicial = -100;
	        		  }else {
	        		  volAtual = volumeInicial + f;
	        		  volumeInicial = volAtual;
	        		 // System.out.println(volAtual);
	        		  }
	        	  }
	        
	        }
	        
	        System.out.println(cont);
	    }
}
