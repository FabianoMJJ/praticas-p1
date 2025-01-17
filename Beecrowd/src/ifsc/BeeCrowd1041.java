package ifsc;

import java.util.Scanner;

public class BeeCrowd1041 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

	
	double x;
	double y;
	
	x = leia.nextDouble();
	y = leia.nextDouble();
	
	if (x > 0) {
		if (y > 0) {
			System.out.println("Q1");
		}
		if (y < 0) {
	        System.out.println("Q4");
		}}
	if (x < 0) {
		if (y < 0) {
			System.out.println("Q3");
		}
	    if (y > 0) {
	    	System.out.println("Q2");
	    }
	}
		
	if (x == 0 && y == 0) {
		System.out.println("Origem");
	}
	if (x != 0 && y == 0) {
		System.out.println("Eixo X");
	}
	if (y != 0 && x == 0) {
		System.out.println("Eixo Y");
	}
		
	}
}
	

	
	
	



