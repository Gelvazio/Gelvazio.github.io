//2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
//� Os n�meros pares digitados;  
//� A soma dos n�meros pares digitados; 
//� Os n�meros �mpares digitados; 
//� A quantidade de n�meros �mpares digitados.

package ExercicioJava04;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = new int[6];
		int somaP=0, contP=0, contI=0;
		
		Scanner scan = new Scanner(System.in);

		for(int x = 0; x < 6; x++) {
			System.out.println("Insira um n�mero: ");
			num[x] = scan.nextInt();	
		} //for para capturar os 6 valores
		
		System.out.println("\nN�meros pares: ");
		for(int x = 0; x < 6; x++) {
			
			if(num[x] % 2 == 0) {
				somaP += num[x];
				contP++;
				System.out.print(num[x] + "; ");
			}
		}
		
		System.out.println("\n\nN�meros �mpares: ");
		for(int x = 0; x < 6; x++) {
		
			if(num[x] % 2 != 0) {
				contI++;
				System.out.print(num[x] + "; ");

			}
			
		}
		System.out.println("\n\nFoi digitado: " + contP + " n�meros pares");
		System.out.println("Foi digitado: " + contI + " n�meros �mpares");
		System.out.println("Total da soma dos n�meros pares: " + somaP);

	}

}
