package ifsc;

import java.util.Scanner;

public class BeeCrowd1118 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double nota1 = 0;
		double nota2 = 0;
		int x = 0;
		double resultado = 0;
		
		calcularMedia(nota1, nota2, resultado, x);
		
        System.out.print ("novo calculo (1-sim 2-nao)");
		x = leia.nextInt();
		
		while (x == 1) {
		calcularMedia(nota1, nota2, resultado, x);
		 System.out.print ("novo calculo (1-sim 2-nao)");
			x = leia.nextInt();	
		}

		while (x < 1 || x > 2) {
			System.out.print("novo calculo (1-sim 2-nao)");
			
			x = leia.nextInt();		
		
		
	}
	}

	public static void calcularMedia(double nota1, double nota2, double resultado, int x) {
   Scanner leia = new Scanner(System.in);
		nota1 = leia.nextDouble();
		
		while (nota1 > 10 || nota1 < 0) {
			System.out.println("nota invalida");
		
		nota1 = leia.nextDouble();
		}
		
        nota2 = leia.nextDouble();
		
		while (nota2 > 10 || nota2 < 0) {
			System.out.println("nota invalida");
       
			nota2 = leia.nextDouble();
		
		}
		resultado = (nota1 + nota2) /2;
		
		System.out.printf("media = %.2f\n", resultado);
		
		
		
		
	}
}
