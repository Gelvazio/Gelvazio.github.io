//6-Escrever um programa que receba v�rios n�meros inteiros no teclado. 
//E no final imprimir a m�dia dos n�meros m�ltiplos de 3. 
//Para sair digitar 0(zero).(DO...WHILE)

package ExerciciosJava03;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		float soma=0, media=0, cont=0;
		
		Scanner scan = new Scanner(System.in);
		

		do {
			
			System.out.println("Digite um n�mero: (1 a 9)");
			num = scan.nextInt();
			
			if(num % 3 == 0 && num != 0) {
				soma += num;
				cont++;
			}			
		}
		
		while(num != 0); 
		
		if(cont != 0) {
		media = soma / cont;
		System.out.println("\nM�dia dos n�meros m�ltiplos de 3: "+ media);		
		
		}
		else {
			media=0;
			System.out.println("\nM�dia dos n�meros m�ltiplos de 3: "+ media);
		}
		
	}
	}
