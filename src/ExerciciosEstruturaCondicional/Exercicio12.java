package ExerciciosEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double primeiroTermo = n / Math.log(n);
		double segundoTermo = 1.25506 * primeiroTermo;
		
		System.out.printf("%.1f %.1f", primeiroTermo, segundoTermo);  
		
		sc.close();
	

	}

}
