//8. O custo ao consumidor de um carro novo � a soma do custo de f�brica 
//com a percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica). 
//Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, 
//escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao consumidor. 

package ExerciciosJava01;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		
		double custof, custod, custoi, custoc;
		
		System.out.println("Qual o custo de fabrica do carro: ");
		custof = scan.nextDouble();
		
		custod= custof + (custof * 28.0)/100.0;
		custoi= custof + (custof * 45.0)/100.0;
		custoc= custof + custod + custoi;
		
		System.out.println("O custo final para o consumidor � R$ "+ custoc);
		
	}

}
