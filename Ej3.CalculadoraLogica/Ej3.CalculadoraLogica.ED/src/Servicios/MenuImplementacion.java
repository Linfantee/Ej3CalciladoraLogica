package Servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz{

	public int mostrarMenuYSeleccion(Scanner comunicacionTecladoM) 
	{
		int eleccion;
		System.out.println("################");
		System.out.println("1. Cerrar");
		System.out.println("2. Igualdad");
		System.out.println("3. Desigualdad");
		System.out.println("Seleccione una opción:");
		System.out.println("################");
		
		eleccion = comunicacionTecladoM.nextInt();
		return eleccion;
	}
	
	
}
