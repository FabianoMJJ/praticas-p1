package ifsc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int a;
		int b;
		int c;

		int maior = 0;
		int menor = 0;

		System.out.println("Insira um número");
		a = leia.nextInt();

		System.out.println("Insira um número");
		b = leia.nextInt();

		System.out.println("Insira um número");
		c = leia.nextInt();

		if (a > b && a > c) {
			maior = a;
		}
		if (b > a && b > c) {
			maior = b;
		}
		if (c > a && c > b) {
			maior = c;
		}

		if (a < b && a < c) {
			menor = a;
		}
		if (b < a && b < c) {
			menor = b;
		}
		if (c < a && c < b) {
			menor = c;
		}

		System.out.printf("O maior número é %d \n", maior);
		System.out.printf("O menor número é %d", menor);
		// Escreva um programa que leia três números e que imprima o maior e o menor

	}

}
