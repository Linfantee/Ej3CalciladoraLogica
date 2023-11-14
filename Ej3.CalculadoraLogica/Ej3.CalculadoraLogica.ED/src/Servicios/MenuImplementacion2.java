package Servicios;

import java.util.Scanner;

public class MenuImplementacion2 implements MenuInterfaz2 {

	private String expresion(int introducirPeticion) 
	{
		Scanner ComunicacionTecladoM = new Scanner(System.in);
		String kuro;
		
		if(introducirPeticion ==0) 
		{
			System.out.println("Introduzca la primera expresión:");
			
		}else 
		{
			System.out.println("Introduzca la segunda expresión:");
			
		}
		 kuro = ComunicacionTecladoM.next();
		 return kuro;
	}
	
	public void igualdad() 
	{
		 String e1 = expresion(0);
		 String e2 = expresion(1);
		 System.out.println("Resultado de la igualdad: " + e1.equals(e2));
		
	}
	
	
	public void desigualdad() 
	{
		 String e1 = expresion(0);
		 String e2 = expresion(1);
		 System.out.println("Resultado de la igualdad: " + !e1.equals(e2));
		
		
	}
	
}
