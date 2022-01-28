package basico;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		System.out.println("Quais valores você deseja somar?");
		Scanner sc = new Scanner(System.in);

		int valor1 = sc.nextInt();
		int valor2 = sc.nextInt();

		int soma = valor1 + valor2;

		System.out.println("A soma dos valores são: " + soma);

		sc.close();

	}

}
