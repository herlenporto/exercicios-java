package ExerciciosEstruturaCondicional;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int e = sc.nextInt();
		int a = sc.nextInt();
		int o = sc.nextInt();
		int w = sc.nextInt();
		int x = sc.nextInt();

		int totalBem = h + e + a + x;
		int totalMal = o + w;

		if (totalBem >= totalMal) {
			System.out.println("Middle-earth is safe.");
		} else {
			System.out.println("Sauron has returned.");
		}

		sc.close();
	}

}
