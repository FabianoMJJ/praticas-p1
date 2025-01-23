package ifsc;

import java.util.Scanner;

public class BeeCrowd1042 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		
		
		
		a = leia.nextInt();
		b = leia.nextInt();
		c = leia.nextInt();
		
		if (a > b && a > c && b > c) {
			System.out.println(c + "\n" + b + "\n" + a + "\n");
		    System.out.println(a + "\n" + b + "\n" + c);
		}
        if (a > b && a > c && c > b) {
        	System.out.println(b + "\n" + c + "\n" + a + "\n");
		    System.out.println(a + "\n" + b + "\n" + c);	
        }
	    if (b > a && b > c && a > c) {
	    	System.out.println(c + "\n" + a + "\n" + b + "\n");
		    System.out.println(a + "\n" + b + "\n" + c);
	    }
	    if (b > a && b > c && c > a) {
	    	System.out.println(a + "\n" + c + "\n" + b + "\n");
		    System.out.println(a + "\n" + b + "\n" + c);
	    }
		if (c > a && c > b && a > b) {
			System.out.println(b + "\n" + a + "\n" + c + "\n");
		    System.out.println(a + "\n" + b + "\n" + c);
		}
		if (c > a && c > b && b > a) {
			System.out.println(a + "\n" + b + "\n" + c + "\n");
		    System.out.println(a + "\n" + b + "\n" + c);
		}
		
	}

}
