package fizzBuzz;
/*
 * Desarrollar un algoritmo que muestre los primeros n 
 * números primos siendo n un valor que debe ingresar 
 * el usuario.
 * 
 */

public class NumerosPrimos {

	public static boolean esPrimo(int n) {
		if (n == 1)
			return false;
		for (int i = 2; i < n; i++)
			if (n % i == 0)
				return false;
		return true;
	}

	/*
	 * 2 3 5 7 11 13 17 19 23
	 */
	public static void listarLosNprimerosPrimos(int n) {
		int contadorDePrimos = 0;
		int i = 2;
		
		while (contadorDePrimos < n) {
			if (esPrimo(i)) {
				contadorDePrimos++;
				System.out.println(i);
			}
			i++;
		}

	}

	public static void main(String[] args) {
		listarLosNprimerosPrimos(100000);

	}

}
