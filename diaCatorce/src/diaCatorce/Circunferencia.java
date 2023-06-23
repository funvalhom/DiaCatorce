package diaCatorce;

import java.util.Scanner;

public class Circunferencia {
	
	public static float operacion() {
		
	    Scanner dato = new Scanner(System.in);
	
		System.out.print("Ingrese el valor del radio: ");
		float area1 = dato.nextFloat();
	
		float area = (float) Math.PI * (area1*area1);
		
		return area;
		
	
	}

}
