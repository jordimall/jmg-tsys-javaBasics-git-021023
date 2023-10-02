package actividad1;

public class actividad1App {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 10;
		double resultado = 0;
		
		resultado = num1 + num2;
		System.out.println("El resultado de la suma entre " + num1 + " y " + num2 + " es: " + resultado );
		
		resultado = num1 - num2;
		System.out.println("El resultado de la resta entre " + num1 + " y " + num2 + " es: " + resultado);
		
		resultado = num1 * num2;
		System.out.println("El resultado de la multiplicación entre " + num1 + " y " + num2 + " es: " + resultado);
		
		resultado = num1 / num2;
		System.out.println("El resultado de la división entre " + num1 + " y " + num2 + " al ser enteros es: " + resultado);
		
		resultado = num1 % num2;
		System.out.println("La resta de la divisón entre " + num1 + " y " + num2 + " es: " + resultado);
	}

}
