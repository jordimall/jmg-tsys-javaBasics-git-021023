package actividad2;

public class actividad2App {

	public static void main(String[] args) {
		int N = 10;
		double A = 3.14;
		char C = 'j';
		double resultado = 0;
		
		System.out.println("variable N = " + N);
		System.out.println("variable A = " + A);
		System.out.println("variable C = " + C);
		
		resultado = N + A;
		System.out.println(N + " + " + A + " = " + resultado);
		
		resultado = N - A;
		System.out.println(N + " - " + A + " = " + resultado);
		System.out.println("Valor numérico del carácter a = " + (int) C);
	}

}
