package exercicios_método;

import java.util.Scanner;

public class Resposta_n3 {
	
	public static void main(String[] args) {	
		
		
		Scanner leitor = new Scanner(System.in);

		int media;
		int m1,m2,m3,m4;
		int x=1; {
		
		do {
			System.out.println("Digite sua "+x+"° nota");
			m1= leitor.nextInt();
			x++;
			System.out.println("Digite sua "+x+"° nota");
			m2= leitor.nextInt();
			x++;
			System.out.println("Digite sua "+x+"° nota");
			m3= leitor.nextInt();
			x++;
			System.out.println("Digite sua "+x+"° nota");
			m4= leitor.nextInt();
			x++;
		}
			while(x<5);
			media = m1+m2+m3+m4/4;
			
			System.out.println("Sua média foi de: "+media);
		
			
			
			if(media <7){
			System.out.println("Reprovado");
			}
			else {
				System.out.println("Aprovado");
			return;

			}

		
	
		
		
		
		
}
	}
	

	}
	
		
	
	
	
	
