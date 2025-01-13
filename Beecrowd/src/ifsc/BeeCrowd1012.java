package ifsc;

import java.util.Scanner;

public class BeeCrowd1012 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double pi = 3.14159;
		double volume;
		double raio;
	
		raio = leia.nextDouble();
		
		volume = (4.0/3.0) * pi * (raio*raio*raio);
		
		System.out.printf("VOLUME = %.3f\n", volume);

	}

}
