package actividad4;

public class actividad4App {

	public static void main(String[] args) {
		int A = 10;
		int B = 20;
		int C = 30;
		int D = 40;
		int tempo = 0;
		
		System.out.println("A: " + A + ", B: " + B + ", C: " + C + ", D: " + D);
		
		tempo = B;
		B = C;
		C = A;
		A = D;
		D = tempo;

		System.out.println("A: " + A + ", B: " + B + ", C: " + C + ", D: " + D);
	}

}
