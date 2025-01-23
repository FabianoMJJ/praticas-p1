package ifsc;

import java.util.Scanner;

public class BeeCrowd1071 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int x;
		int y;
	    int comeco=0;
	    int fim=0;
	    int soma=0;
	    

	    x = leia.nextInt();
	    y = leia.nextInt();
	    
	    if (x > y) {
	    comeco = x;
	    fim = y;
	    }
	    if (y > x) {
	    comeco = y;
	    fim = x;
	    }
	
	while (comeco > fim) {
		comeco -= 1;
	if (comeco > fim) {
		
	
		if (comeco %2 !=0) {
		soma = comeco + soma;
		
	}
	}
	} 
	
	
	System.out.println(soma);
	}

}
