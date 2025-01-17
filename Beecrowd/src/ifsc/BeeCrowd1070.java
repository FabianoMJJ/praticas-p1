package ifsc;

import java.util.Scanner;

public class BeeCrowd1070 {

	public static void main(String[] args) {
	
     Scanner leia = new Scanner(System.in);
	
	int x;
	
	x = leia.nextInt();
	
	if (x %2 == 0) {
	
     
	 System.out.println(x +1);
	 System.out.println(x+3);
	 System.out.println(x+5);
	 System.out.println(x+7);
	 System.out.println(x+9);
	 System.out.println(x+11);
	
	
	}
	
	if (x %2 != 0) {
		
	System.out.println(x);
	System.out.println(x+2);
	System.out.println(x+4);
	System.out.println(x+6);
	System.out.println(x+8);
	System.out.println(x+10);
	}
	
	
	
	
	
	
	
	
	
	
	}

}
