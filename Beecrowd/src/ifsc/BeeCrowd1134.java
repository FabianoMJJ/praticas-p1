package ifsc;

import java.util.Scanner;

public class BeeCrowd1134 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int alcool=0;
		int gasolina=0;
		int diesel=0;
		int combustivel=0;
		
		combustivel = leia.nextInt();
				
		while (combustivel !=4) {
			
	    
			
	    if (combustivel == 1) {
				alcool +=1;
			
			}
		    if (combustivel == 2) {
		    	gasolina +=1;
		    
		    }
		    if (combustivel == 3) {
		    	diesel +=1;
		    
		    }
		
		  
		    	combustivel = leia.nextInt();
		    
		}
		    
		    if (combustivel ==4) {
				System.out.println("MUITO OBRIGADO");
				System.out.println("Alcool: " +alcool);
				System.out.println("Gasolina: " +gasolina);
				System.out.println("Diesel: " +diesel);
		 }
		    
		    
		    
		  
		   
	}
	
	
	}

