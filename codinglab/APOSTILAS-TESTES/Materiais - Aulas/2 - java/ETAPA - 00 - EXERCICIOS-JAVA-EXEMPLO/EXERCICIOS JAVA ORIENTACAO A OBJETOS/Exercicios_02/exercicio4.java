
//4-Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba 
//se este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do 
//mesmo; se for �mpar exiba o n�mero elevado ao quadrado.

package ExerciciosJava02;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String arg[]) {
	
		
		int num;
		double raiz;
		
		Scanner scan = new Scanner (System.in);

		
		System.out.println("Digite um n�mero: ");
		num = scan.nextInt();
		
		
		if(num % 2 == 0) {
			raiz = Math.sqrt(num); 
			// Math.sqrt ->  faz a raiz quadrada de um n�mero, precisa que seja double para n�o estourar a vari�vel.
			System.out.printf("Este n�mero � par. A sua raiz quadrada �: %2.3f", raiz);
		}
		
		else {
			num = (int) Math.pow(num, 2); 
			// Math.pow -> vai transformar um n�mero a sua pot�ncia 
			System.out.println("Este n�mero � �mpar." + "\nElevado ao quadrado �: " + num);

		}
		
		
		
	}
}
