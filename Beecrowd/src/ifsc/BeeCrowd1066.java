package ifsc;

import java.util.Scanner;

public class BeeCrowd1066 {

	public static void main(String[] args) {
		
    double v1;
    double v2;
    double v3;
    double v4;
    double v5;
    int pares = 0;
    int impares = 0;
    int positivo = 0;
    int negativo = 0;
    
    Scanner leia = new Scanner(System.in);
    
    v1 = leia.nextDouble();
    v2 = leia.nextDouble();
    v3 = leia.nextDouble();
    v4 = leia.nextDouble();
    v5 = leia.nextDouble();
		
    if (v1 > 0) {
    	positivo += 1;
    }
    if (v1 < 0) {
    	negativo += 1;
    }
    if (v1 %2 == 0) {
    	pares += 1;
    }
    else {
        impares += 1;
    }
    
    if (v2 > 0) {
    	positivo += 1;
    }
    if (v2 < 0) {
    	negativo += 1;
    }
    if (v2 %2 == 0) {
    	pares += 1;
    }
    else {
        impares += 1;
    }
    
    if (v3 > 0) {
    	positivo += 1;
    }
    if (v3 < 0) {
    	negativo += 1;
    }
    if (v3 %2 == 0) {
    	pares += 1;
    }
    else {
        impares += 1;
    }
    
    if (v4 > 0) {
    	positivo += 1;
    }
    if (v4 < 0) {
    	negativo += 1;
    }
    if (v4 %2 == 0) {
    	pares += 1;
    }
    else {
        impares += 1;
    }
    
    if (v5 > 0) {
    	positivo += 1;
    }
    if (v5 < 0) {
    	negativo += 1;
    }
    if (v5 %2 == 0) {
    	pares += 1;
    }
    else {
        impares += 1;
    }
    
    
    
    

    
    
    
    
    
   System.out.println(pares+" valor(es) par(es)");
   System.out.println(impares+" valor(es) impar(es)");
   System.out.println(positivo+" valor(es) positivo(s)");
   System.out.println(negativo+" valor(es) negativo(s)");
   
	
     }

}
