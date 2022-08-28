package Subprogramas_Lista3;

import java.text.*;
import java.util.*;

public class Triangular {

	private static Scanner s = new Scanner(System.in);
	private static DecimalFormat df = new DecimalFormat("00");
	
	public static void verificaTriangularidade() 
	{
		System.out.println("Informe um n�mero inteiro positivo");
		int num = s.nextInt();
		
		int base = 1;
		while (true)
		{
			int res = (base * (base+1) * (base+2));
			if ( res == num ) 
			{
				System.out.println("-->" + num + " � triangular (" + base + "*" + (base+1) + "*" + (base+2) + "= " + base * (base+1) * (base+2) + ")");
				break;
			}
			else
				if ( res > num ) 
				{
					System.out.println("-->" + num + " n�o � um n�mero triangular");
					break;
				}
			
			base++;
		}
	}
	
	public static void main(String[] args) {
		try
		{
			verificaTriangularidade();
		}
		catch(Exception e)
		{
			System.out.println("N�o foi possivel determinar.");
		}
	}
}