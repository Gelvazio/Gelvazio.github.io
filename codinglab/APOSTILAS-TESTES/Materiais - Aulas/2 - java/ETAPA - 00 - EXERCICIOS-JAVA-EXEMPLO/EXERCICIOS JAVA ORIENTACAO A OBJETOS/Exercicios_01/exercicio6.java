 //Construa um programa em Java que, tendo como dados de entrada dois pontos quaisquer
//no plano, P(x1, y1) e P(x2, y2), escreva a dist�ncia entre eles. 
//A f�rmula que efetua tal c�lculo �:

package ExerciciosJava01;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x1, x2, y1, y2, d;
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("N�mero para x1: ");
		x1 = scan.nextDouble();

		System.out.println("N�mero para x2: ");
		x2 = scan.nextDouble();

		System.out.println("N�mero para y1: ");
		y1 = scan.nextDouble();

		System.out.println("N�mero para y2: ");
		y2 = scan.nextDouble();
		
		d = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		
		System.out.printf("\n A dist�ncia entre os pontos: %.2f" , d);
		
			
	}

}
