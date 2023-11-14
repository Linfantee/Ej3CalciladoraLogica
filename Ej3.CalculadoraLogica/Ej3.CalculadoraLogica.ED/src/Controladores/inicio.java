package Controladores;

import java.util.Scanner;

import Servicios.MenuImplementacion;
import Servicios.MenuImplementacion2;
import Servicios.MenuInterfaz;
import Servicios.MenuInterfaz2;

public class inicio
{
	public static void main(String[] args) 
	{
		
		 Scanner comunicacionTeclado = new Scanner(System.in);                          
		 boolean salir = false;
		 int seleccion;
		 
		 MenuInterfaz aka = new MenuImplementacion();
		 MenuInterfaz2 ao = new MenuImplementacion2();
		 
		 while(!salir) 
		 {
			 seleccion = aka.mostrarMenuYSeleccion(comunicacionTeclado);
			 switch(seleccion)
			 {
				 case 1:
					 salir = true;
				     break;
				     
				 case 2:
					 System.out.println("Ha seleccionado la opción igualdad");
					 ao.igualdad();
					 break;
					 
				 case 3:
					 System.out.println("Ha seleccionado la opción desigualdad");
					 ao.desigualdad();
					 break;
			 }
	     }
			 
			 
			 
			 
		 
		 
		 
		 
	}
	
     




}