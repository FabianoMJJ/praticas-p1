package ifsc;

import java.util.Scanner;

public class BeeCrowd1017 {

	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
	
	double tempo;
	double velocidade;
	double combustivel =0;
	
	tempo = leia.nextDouble();
	velocidade = leia.nextDouble();
	
	combustivel = (tempo*velocidade) / 12;
	
	System.out.printf("%.3f", combustivel);
	System.out.print("\n");

	}

}
