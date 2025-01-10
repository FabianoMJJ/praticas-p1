package ifsc;

import java.util.Scanner;

public class BeeCrowd1060 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		double v1;
		double v2;
		double v3;
		double v4;
		double v5;
		double v6;
		int positivos = 0;
		
		v1 = leia.nextDouble();
		v2 = leia.nextDouble();
		v3 = leia.nextDouble();
		v4 = leia.nextDouble();
		v5 = leia.nextDouble();
		v6 = leia.nextDouble();
		
		if (v1 > 0) {
			positivos += 1;
		}
        if (v2 > 0) {
        	positivos += 1;
        }
		if (v3 > 0) {
			positivos += 1;
		}
		if (v4 > 0) {
			positivos += 1;
		}
		if (v5 > 0) {
			positivos += 1;
		}
		if (v6 > 0) {
			positivos += 1;
		}
		
	System.out.println(positivos+" valores positivos");
        
        
        
	}

}
