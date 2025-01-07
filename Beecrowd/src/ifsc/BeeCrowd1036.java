package ifsc;

import java.util.Scanner;

public class BeeCrowd1036 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		double a;
		double b;
		double c;
		double r1;
		double r2;
		
		a = leia.nextDouble();
		b = leia.nextDouble();
		c = leia.nextDouble();
		
		r1 = (-b + Math.sqrt((b*b) - 4 * a * c)) / (2*a);
		
        r2 = (-b - Math.sqrt((b*b) - 4 * a * c)) / (2*a);
      
	
        if(a == 0 || (b*b) - 4 * a * c < 0 ) {
        System.out.println("Impossivel calcular");
     }
       if (a!=0 && (b*b) - 4 * a * c > 0) {
    	System.out.printf("R1 = %.5f\n", r1);
       
    	System.out.printf("R2 = %.5f\n", r2);     
       }
       
        
	}

}
