package ifsc;
import java.util.Scanner;
public class BeeCrowd1049 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		String primeira;
		String segunda;
		String terceira;
		
		
		primeira = leia.nextLine();
		segunda = leia.nextLine();
		terceira = leia.nextLine();
		
		if (primeira.equals("vertebrado")) {
       
			if (segunda.equals("ave")) {
    
				if (terceira.equals("carnivoro")) {
					System.out.println("aguia");
				}
		        if (terceira.equals("onivoro")) {
		        	System.out.println("pomba");
		        }
			}
			if (segunda.equals("mamifero")) {
				
				if (terceira.equals("onivoro")) {
					System.out.println("homem");
				}
			    if (terceira.equals("herbivoro")) {
			    	System.out.println("vaca");
			    }
		}
	}
		if (primeira.equals("invertebrado")) {
			
			if (segunda.equals("inseto")) {
				
				if (terceira.equals("hematofago"))
					System.out.println("pulga");
			
			    if (terceira.equals("herbivoro")) {
			    	System.out.println("lagarta");
			    }
				
			}
		
			if (segunda.equals("anelideo")) {
				
				if (terceira.equals("hematofago")) {
					System.out.println("sanguessuga");
				}
			
			    if (terceira.equals("onivoro")) {
			    	System.out.println("minhoca");
			    }
			
			}
			}
        
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	}