package ifsc;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
	
	double circuferencia;
	double raio;
	double area;
	double pi = 3.14;
	
	
		System.out.print("Digite a área");
		area = leia.nextDouble();
		
		System.out.print("Digite o raio");
		raio = leia.nextDouble();
		
		area = pi * (raio*raio);
		
		System.out.println("A área é: " +area);
		
		
	
		
		
		
		//1-Faca um algoritmo para calcular a area de uma circunferência, considerando a fórmula
		//ÁREA = π * RAIO2. Utilize as variaveis AREA e RAIO, a constante π (pi = 3,14159) e os
	    //	operadores aritméticos de multiplicação.
	}

}
