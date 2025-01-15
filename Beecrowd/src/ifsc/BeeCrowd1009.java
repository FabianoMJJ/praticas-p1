package ifsc;

import java.util.Scanner;

public class BeeCrowd1009 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		double salario;
		double vendas;
	    double total = 0;
		
	    nome = leia.next();
	    salario = leia.nextDouble();
	    vendas = leia.nextDouble();
	    
	    total = salario + (vendas*0.15);
	    
	    System.out.printf("TOTAL: %.2f\n", total);
	
	
	}

}
