package ejerciciosCondicionales_semana03_012313537;

import java.util.Scanner;
public class ejercicio14 
{
	public static void main(String[] args) 
	{
		int numDia;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Escrida el numero de dia de la semana (1 - 7): ");
		
		numDia = entrada.nextInt();
		
		switch (numDia)
		{
			case 1:
			{
				System.out.println("Lunes");
				
				break;
			}
			
			case 2:
			{
				System.out.println("Martes");
				
				break;
			}
			
			case 3:
			{
				System.out.println("Miercoles");
				
				break;				
			}
			
			case 4:
			{
				System.out.println("Jueves");
				
				break;
			}
			
			case 5:
			{
				System.out.println("Viernes");
				
				break;
			}
			
			case 6:
			{
				System.out.println("Sabado");
				
				break;
			}
			
			case 7:
			{
				System.out.println("Domingo");
				
				break;
			}
			
			default:
			{
				System.out.println("ERROR");
				System.out.println("Numero invalido");
				
				break;
			}
		}
		
		entrada.close();
	}
}
