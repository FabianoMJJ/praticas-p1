package ifsc;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Insira um número");
		numero = leia.nextInt();
		
		if(numero <=10 && numero >= 0) {
		System.out.println("F1");
		}
		
		if(numero > 10 && numero<=100) {
		System.out.println("F2");
		}
		
		if(numero > 100) {
		System.out.println("F3");
		}
		else if(numero < 0){
	    System.out.println("Numeros negativos são inválidos");
		}
		
		
		
		
		// Faça um algoritmo que leia um número N e imprima “F1”, “F2” ou “F3”, conforme a
		//    condição:
		//	• “F1”, se N <= 10
		//	• “F2”, se N > 10 e N <= 100
		//	• “F3”, se n > 100
		
	}

}
