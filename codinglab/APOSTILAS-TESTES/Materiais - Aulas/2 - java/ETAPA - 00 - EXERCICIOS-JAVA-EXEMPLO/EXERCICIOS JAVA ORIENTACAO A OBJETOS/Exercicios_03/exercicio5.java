//5-Crie um programa que leia um n�mero do teclado at� que encontre um 
//n�mero igual a zero.
//No final, mostre a soma dos n�meros digitados.(DO...WHILE)

package ExerciciosJava03;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num, soma=0;
		
		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("Digite um n�mero: (1 a 9)");
			num = scan.nextInt();
			
			soma += num;
			System.out.println("\tVoc� pode digitar '0'(zero) para sair\n");
		}
		
		while(num != 0); 
		
		System.out.println("A soma dos n�meros digitados ser�: " + soma);
	}

}
