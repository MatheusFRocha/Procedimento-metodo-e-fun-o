package exercicios_método;

import java.util.Scanner;

public class Resposta_n4 {

	public static void main(String[] args) {
		
		
		Scanner leitor= new Scanner(System.in);
	
		double x,y;
		int soma,multiplicacao,divisao,subtracao;
		int v=1;
		int operacao = 0;
		
		System.out.println("Digite dois números inteiros.");
		System.out.println();
		System.out.println("Digite o "+v+"° número.");
		x= leitor.nextInt();
		v++;
		System.out.println("Digite o "+v+"° número.");
		y= leitor.nextInt();
		System.out.println();
		System.out.println("Agora escolha uma operação que deseja realizar.");
		System.out.println("1-- SOMA");
		System.out.println("2-- SUBTRAÇÃO");
		System.out.println("3-- MULTIPLICAÇÃO");
		System.out.println("4-- DIVISÃO");
		operacao = leitor.nextInt();
		
		
		
		switch(operacao) {
		
		case 1: {
			soma = (int) +(x+y);
			System.out.println("A soma é: "+soma);
			break;
		}
		case 2:{
			subtracao = (int) -(x-y);
			System.out.println("A subtração é: "+subtracao);
			break;
		}
		case 3:{
			multiplicacao = (int) (x*y);
			System.out.println("A multiplicação é: "+multiplicacao);
			break;
		}
		case 4:{
			divisao = (int) (x/y);
			System.out.println("A divisão é:"+divisao);
			break;
		}
		default: System.out.println("Não é possivel realizar essaa operação.");
			
			
		}
		
		}
		

	}


