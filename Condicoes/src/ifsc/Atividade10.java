package ifsc;

import java.util.Scanner;

public class Atividade10 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		double portugues;
		double matematica;
		double conhecimentos;
		double media;
		
		System.out.print("Digite seu nome");
		nome = leia.next();
		
		System.out.print("Digite sua nota em português");
		portugues = leia.nextDouble();
		
		System.out.print("Digite sua nota em matemática");
		matematica = leia.nextDouble();
		
		System.out.print("Digite sua nota em conhecimentos gerais");
		conhecimentos = leia.nextDouble();
		
		media = (portugues + matematica + conhecimentos) / 3.0;
		
		
		System.out.println("Seu nome:" +nome);
		
		System.out.println("Sua nota em portugues é:" +portugues);
		System.out.println("Sua nota em matematica é:" +matematica);
		System.out.println("Sua nota em conhecimentos gerais é:" +conhecimentos);
		
		System.out.printf("Sua média é:%.2f \n", media);
		
		if(media > 7) {
		System.out.println("Aprovado");
		}
		if(media < 7) {
		System.out.println("Reprovado");
		}
		if(portugues > 5 && matematica > 5 && conhecimentos > 5) {
		System.out.println("Não apresentou nota abaixo de 5");
		}
		if(portugues < 5 || matematica < 5 || conhecimentos < 5) {
		System.out.println("Apresentou alguma nota abaixo de 5");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		//10-Considere que o último concurso vestibular apresentou três provas: Português,
		//Matemática e Conhecimentos Gerais. Considerando que para cada candidato tem-se um
		//registro contendo o seu nome e as notas obtidas em cada uma das provas, construa um
		//algoritmo que forneça:
		//a) o nome e as notas em cada prova do candidato
		//b) a média do candidato
		//c) uma informação dizendo se o candidato foi aprovado ou não. Considere que um
		//candidato é aprovado se sua média for maior que 7.0 e se não apresentou nenhuma nota
		//abaixo de 5.0.
	}

}
