package diaCatorce;

import java.util.Scanner;

public class Operaciones {
	
	public static double Sumas() {
		Scanner dato = new Scanner(System.in);
		System.out.print("Por favor ingrese el primer valor: ");
		double suma1 = dato.nextDouble();
		
        System.out.print("Por favor ingrese el segundo valor: ");
		double suma2 = dato.nextDouble();
		
		double suma = suma1 + suma2;
		
		return  suma;
		
	}
	
	public static double resta() {
		Scanner dato = new Scanner(System.in);
		System.out.print("Por favor ingrese el primer valor: ");
		double resta1 = dato.nextDouble();
		
        System.out.print("Por favor ingrese el segundo valor: ");
		double resta2 = dato.nextDouble();
		
		double resta = resta1 - resta2;
		
		return  resta;
	}
	
	public static double multiplicacion() {
	Scanner dato = new Scanner(System.in);
	System.out.print("Por favor ingrese el primer valor: ");
	double multi1 = dato.nextDouble();
	
    System.out.print("Por favor ingrese el segundo valor: ");
	double multi2 = dato.nextDouble();
	
	double multiplica = multi1 * multi2;
	
	return  multiplica;
	}
	
	public static double division() {
		Scanner dato = new Scanner(System.in);
		System.out.print("Por favor ingrese el dividendo: ");
		double div1 = dato.nextDouble();
		
	    System.out.print("Por favor ingrese el divisor: ");
		double div2 = dato.nextDouble();
		
		double divide = div1 / div2;
		
		return  divide;
		}
	
}
