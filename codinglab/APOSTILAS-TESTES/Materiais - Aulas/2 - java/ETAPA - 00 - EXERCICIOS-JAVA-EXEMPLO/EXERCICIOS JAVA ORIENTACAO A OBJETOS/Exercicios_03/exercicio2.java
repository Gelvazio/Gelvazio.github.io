//2-Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)

package ExerciciosJava03;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, x, contpar=0, contimp=0;

		Scanner scan = new Scanner(System.in);

		for(x=0; x<=10; x++) {
			System.out.println("Digite um n�mero: ");
			num = scan.nextInt();
			
			if(num % 2 == 0) {
				contpar++;
			}
			else {
				contimp++;
			}
			
		}
		System.out.println("Voc� digitou: " + contpar + " n�meros pares");
		System.out.println("Voc� digitou: " + contimp + " n�meros �mpares");
	}

}
