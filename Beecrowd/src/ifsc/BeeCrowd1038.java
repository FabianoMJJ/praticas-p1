package ifsc;

import java.util.Scanner;

public class BeeCrowd1038 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int codigo;
	    double quantidade;
	    double preco = 0;
	    
	    codigo = leia.nextInt();
	    quantidade = leia.nextDouble();
	    
	   if (codigo == 1) {
	   preco = 4.00 * quantidade;
	   }
	   if (codigo == 2) {
	   preco = 4.50 * quantidade;
	   }
	   if (codigo == 3) {
	   preco = 5.00 * quantidade;
	   }
	   if (codigo == 4) {
	   preco = 2.00 * quantidade;
	   }
	   if (codigo == 5) {
	   preco = 1.50 * quantidade;
	   }
	    
	    System.out.printf("Total: R$ %.2f\n", preco);
	    
		
		
		
		
	}

}
