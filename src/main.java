import java.io.IOException;
import java.util.Scanner;

public class main {

	public static final int[] porcoes = { 300, 1500, 600, 1000, 150 };
	 
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
      
        for(int i=0;i<=5-1;i++) {
        	int x = porcoes[i] + 1;
        	System.out.println(x);
        }



        }
}
