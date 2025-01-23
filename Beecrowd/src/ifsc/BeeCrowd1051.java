package ifsc;

import java.util.Scanner;

public class BeeCrowd1051 {
		
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double renda;
		double imposto =0;
		double taxa18;
		double taxa28;
		
		renda = leia.nextDouble();
		
		if (renda <= 2000.00) {
			System.out.println("Isento");
	}

		if (renda >= 2000.01 && renda  <= 3000.00) {
		imposto = (renda - 2000) * 0.08;
		System.out.printf("R$ %.2f\n", imposto);
		}
		
		if (renda >= 3000.01 && renda <= 4500.00) {
		taxa18 = renda - 3000;
		imposto = (taxa18 * 0.18) + (1000.00 * 0.08);
		System.out.printf("R$ %.2f\n", imposto);
		}
		
				
		if (renda > 4500.00) {
		taxa28 = renda - 4500;
		taxa18 = renda - taxa28 - 3000;
		imposto = (taxa28 * 0.28) + (taxa18 * 0.18) + (1000.00 * 0.08);
		System.out.printf("R$ %.2f\n", imposto);
		}
		
			  
		
	}
		
	}


