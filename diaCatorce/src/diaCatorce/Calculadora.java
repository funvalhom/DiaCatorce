package diaCatorce;

public class Calculadora {

	public static void main(String[] args) {
    Operaciones op = new Operaciones();
    
    System.out.println ("La primera operacion es una suma");
    System.out.println(); // en blanco
    
    double division = op.division();
    System.out.println ("El resultado de la suma es: " + division);
    
    System.out.println(); // en blanco
    System.out.println ("La siguiente operacion es una suma");
    System.out.println(); //  en blanco
    
    double suma = op.Sumas();
    System.out.println ("El resultado de la suma es: " + suma);
    
    System.out.println(); // en blanco
    System.out.println ("La siguiente operacion es una resta");
    System.out.println(); //  en blanco
    
    double resta = op.resta();
    System.out.println ("El resultado de la suma es: " + resta);
    
    System.out.println(); // en blanco
    System.out.println ("La siguiente operacion es una multiplicacion");
    System.out.println(); //  en blanco
    
    double multiplica = op.multiplicacion();
    System.out.println ("El resultado de la suma es: " + multiplica);
    
    
    
	
    
    

	}

}
