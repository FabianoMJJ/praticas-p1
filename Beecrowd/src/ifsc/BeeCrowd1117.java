package ifsc;

import java.util.Scanner;

public class BeeCrowd1117 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		double nota1;
		double nota2;
		double resultado;
		
		nota1 = leia.nextDouble();
		
		while (nota1 < 0 || nota1 > 10) {
			System.out.println("nota invalida");
		
		nota1 = leia.nextDouble();
		}

		nota2 = leia.nextDouble();
		
		while (nota2 < 0 || nota2 > 10) {
			System.out.println("nota invalida");
       
			nota2 = leia.nextDouble();
}

		resultado =(nota1 + nota2) /2;
	
	System.out.printf("media = %.2f\n", +resultado);
	
	
	
	}

}
