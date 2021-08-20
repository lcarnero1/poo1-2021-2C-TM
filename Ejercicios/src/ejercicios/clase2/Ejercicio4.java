package ejercicios.clase2;

public class Ejercicio4 {

	public static String darVueltaLaFecha(int fecha) {
		
		int anio = fecha / 10000;
		int dia = fecha % 100;
		int mes = fecha / 100 % 100;
				
		return ("dia " + dia +", mes " + mes + ", año " + anio);
			
	}
	
	public static void main(String[] args) {
		
		System.out.println(darVueltaLaFecha(20210813));
		System.out.println(darVueltaLaFecha(19951208));
		System.out.println(darVueltaLaFecha(18100525));
		System.out.println(darVueltaLaFecha(18160709));
		System.out.println(darVueltaLaFecha(18500817));
		
	}

}
