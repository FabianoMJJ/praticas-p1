package ifsc;

import java.util.Scanner;

public class BeeCrowd1035 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int a;
		int b;
		int c;
		int d;
		
		a = leia.nextInt();
		

		b = leia.nextInt();
		
		
	    c = leia.nextInt();
	    
	  
	    d = leia.nextInt();
	    
	    if (b > c && d > a && (c + d) > (a + b) && c > 0 && d > 0 && a%2 == 0 ) {
	    System.out.println("Valores aceitos");
	    }
	    else {
	    System.out.println("Valores não aceitos");
	    }
	
	
	
	    //se B for maior do que C e se D for maior do que A, e a soma de C com D for maior que a soma de A e B e se C e D,
	    //ambos, forem positivos e se a variável A for par escrever a mensagem "Valores aceitos", senão escrever "Valores nao aceitos".
	
	
	
	
	}
	

}
