package ifsc;

import java.util.Scanner;

public class BeeCrowd1010 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);

	 int codigo1;
	 int codigo2;
	 double quantidade1;
	 double quantidade2;
	 double valor1;
	 double valor2;
	 double resultado1;
	 double resultado2;
	 double resultadofinal;
	 
	 codigo1 = leia.nextInt();
	 quantidade1 = leia.nextDouble();
	 valor1 = leia.nextDouble();
	
	 codigo2 = leia.nextInt();
	 quantidade2 = leia.nextDouble();
	 valor2 = leia.nextDouble();
	 
	 resultado1 = valor1 * quantidade1;
	 resultado2 = valor2 * quantidade2;
	
	resultadofinal = resultado1 + resultado2;
	
	System.out.printf("VALOR A PAGAR: R$ %.2f\n", resultadofinal);
	
	
	}

}
