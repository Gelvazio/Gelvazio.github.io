//4- Fa�a um programa que leia duas matrizes 2 x 2 com valores reais. 
//Ofere�a ao usu�rio um menu de op��es:
//(1) somar as duas matrizes 
//(2) subtrair a primeira matriz da segunda 
//(3) adicionar uma constante as duas matrizes
//(4) imprimir as matrizes 
//Nas duas primeiras op��es uma terceira matriz 2 x 2 deve ser criada. 
//Na terceira op��o o valor da constante deve ser lido e o resultado da adi��o
//da constante deve ser armazenado na pr�pria matriz.

package ExercicioJava04;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float [][] a = new float[2][2];
		float [][] b = new float[2][2];
		float [][] d = new float[2][2];
			// o 'new' vai instanciar um objeto ou seja ser� criado um objeto.

		int constante,l,c,op;
		
		Scanner scan = new Scanner(System.in);
		
		for(l=0;l<2;l++)
		{
			for(c=0;c<2;c++)
			{
				System.out.println("\nEntre com o valor da Matriz1: ");
				a[l][c] = scan.nextFloat();
				System.out.println("\nEntre com o valor da Matriz2: ");
				b[l][c] = scan.nextFloat();
			}
		}
		
		do
		{
			System.out.println("\n\t\t\tMenu de op��es");
			System.out.println("\n(1) Somar as duas matrizes.");
			System.out.println("\n(2) Subtrair a primeira matriz da segunda.");
			System.out.println("\n(3) Adicionar uma constante as duas matrizes."); 
			System.out.println("\n(4) Imprimir as matrizes.");
			System.out.println("\n(0) Sair do programa.");
			
			System.out.println("\nDigite sua op��o: ");
			op = scan.nextInt();
			
			switch(op)
			{
			case 1:
				for(l=0;l<2;l++)
				{
					for(c=0;c<2;c++)
					{
						d[l][c] = a[l][c] + b[l][c];
						System.out.println("\nSoma: "+d[l][c]);
					}
				}
				break;
			case 2:
				for(l=0;l<2;l++)
				{
					for(c=0;c<2;c++)
					{
						d[l][c] = b[l][c] - a[l][c];
						System.out.println("\nDiferen�a: "+d[l][c]);
					}
				}
				break;
			case 3:
				System.out.println("\nEntre com o valor da constante: ");
				constante = scan.nextInt();
				for(l=0;l<2;l++)
				{
					for(c=0;c<2;c++)
					{
						a[l][c] = a[l][c] + constante;
						b[l][c] = b[l][c] + constante;
						System.out.println("\nMatriz1: "+a[l][c]);
						System.out.println("\nMatriz2: "+b[l][c]);
					}
				}
				break;
			case 4:
				for(l=0;l<2;l++)
				{
					for(c=0;c<2;c++)
					{
						
						System.out.println("\nMatriz1: "+a[l][c]);
						System.out.println("\nMatriz2: "+b[l][c]);
					}
				}
				break;
				default:
					System.out.println("\n Op��o inv�lida!!!");
			}
		}
		while(op!=0);
	}
}