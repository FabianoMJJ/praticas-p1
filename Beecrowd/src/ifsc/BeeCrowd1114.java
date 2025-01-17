package ifsc;

import java.util.Scanner;

public class BeeCrowd1114 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int senha;
	
	
	senha = leia.nextInt();
	
	while (senha != 2002) {
		System.out.println("Senha Invalida");
		
		senha = leia.nextInt();
	
	}
	
	if (senha == 2002) {
		System.out.println("Acesso Permitido");
	}
	
	
	
	
	
	
	
	}
	
}
