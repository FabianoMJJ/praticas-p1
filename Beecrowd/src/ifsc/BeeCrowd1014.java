package ifsc;

import java.util.Scanner;

public class BeeCrowd1014 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		double distancia;
		double combustivel;
		double media;
		
		distancia = leia.nextDouble();
		combustivel = leia.nextDouble();
		
		media = distancia / combustivel;
		
		System.out.printf("%.3f", media);
		System.out.println(" km/l");

	}

}
