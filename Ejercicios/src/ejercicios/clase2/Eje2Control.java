package ejercicios.clase2;

import java.util.Arrays;
import java.util.Scanner;

public class Eje2Control {

	public static void main(String[] args) {
		int a = 14;
		int b = 13;
		int c = 12;
	
		
		int mayor = Math.max(a, b);
		mayor = Math.max(mayor, c);
		
		int menor = Math.min(a, b);
		menor = Math.min(menor, c);
		
		int medio = a;
		if (a > menor && a < mayor)
			medio = a;
		if (b > menor && b < mayor)
			medio = b;
		if (c > menor && c < mayor)
			medio = c;
		
	System.out.println(menor);
	System.out.println(medio);
	System.out.println(mayor);
	
	}
	
	

}
