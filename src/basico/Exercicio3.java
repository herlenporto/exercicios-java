package basico;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		System.out.println("Digite quatro valores:");
		
		Scanner sc = new Scanner(System.in);
		
		int s1, s2, s3, s4;
		
		s1 = sc.nextInt();
		s2 = sc.nextInt();
		s3 = sc.nextInt();
		s4 = sc.nextInt();

		int diferenca = (s1 * s2 - s3 * s4);
		
		System.out.println("A diferença do produto é " + diferenca);
		
		sc.close();
	}

}
