package ejerciciosCondicionales_semana03_012313537;

public class ejercicio07 
{
	public static void main(String[] args) 
	{
		int x=1, y=2, z=3;
		
		if(++x > y++ || x-- >0)
			z++;
		else
			z--;
		System.out.println(x+" "+y+" "+z);
	}
}

// El resultado 1 3 4