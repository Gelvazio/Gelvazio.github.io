//4. Escreva  um sistema que leia tr�s n�meros inteiros 
//e positivos (A, B, C) e calcule a seguinte express�o: 

// D= (R + S) / 2 ;  R = (A + B) � ; S = (B + C)�

package ExerciciosJava01;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, b, c, d, r, s;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Numero de a: ");
		a = scan.nextInt();
		
		System.out.println("Numero de b: ");
		b = scan.nextInt();
		
		System.out.println("Numero de c: ");
		c = scan.nextInt();
		
		r = (int) Math.pow(a + b,2);
		// metodo pow � para elevar um numero ou uma express�o ao quadrado ou infinito(haha)
		
		s = (int) Math.pow(b + c,2);
		
		d = (r + s) / 2;
		
		System.out.println("O resultado �: " + d);
		
	}

}
