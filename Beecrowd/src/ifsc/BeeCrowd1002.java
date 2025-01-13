package ifsc;

import java.util.Scanner;

public class BeeCrowd1002 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double raio;
		double area;
		double n = 3.14159;
		
		raio = leia.nextDouble();
		
		area = n * (raio*raio);
		
		System.out.printf("A=%.4f", area);
		

	}

}
