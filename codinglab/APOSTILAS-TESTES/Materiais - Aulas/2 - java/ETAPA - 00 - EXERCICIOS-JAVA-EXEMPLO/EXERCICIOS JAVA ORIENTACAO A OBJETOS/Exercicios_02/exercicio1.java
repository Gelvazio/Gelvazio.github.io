//1-Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

package ExerciciosJava02;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num1, num2, num3;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1� n�mero: ");
		num1 = scan.nextInt();
		
		System.out.println("2� n�mero: ");
		num2 = scan.nextInt();
		
		System.out.println("3� n�mero: ");
		num3 = scan.nextInt();
		
		
		if(num1>num2 && num1 > num3) {
			System.out.println("O n�mero: " + num1 + " � o maior que foi digitado");

		}
		else if(num2 > num1 && num2 > num3) {
			System.out.println("O n�mero: " + num2 + " � o maior que foi digitado");

		}
		else {
			System.out.println("O n�mero: " + num3 + " � o maior que foi digitado");

		}
		
	}

}
