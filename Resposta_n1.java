package exercicios_método;

import java.util.Scanner;

public class Resposta_n1 {

	public static void main(String[] args) {
		
		multi();
		
	}
		
		public static void multi() {
		
			Scanner leitor= new Scanner(System.in);
			
			int multiplicacao;
			int x, y;
		
			System.out.printf("Digite dois números inteiros: " );
			x=leitor.nextInt();
			System.out.println("Digite o próximo número: ");
			y=leitor.nextInt();
			
			multiplicacao = x*y;
			
			System.out.println("O resultado é: "+multiplicacao);
		
		
		
		
		
		
		
		
		

	}

}
