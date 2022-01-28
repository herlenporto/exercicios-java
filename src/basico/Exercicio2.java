package basico;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		System.out.println("Qual o valor do raio?");

		Scanner sc = new Scanner(System.in);

		double valorRaio = sc.nextDouble();
		double area = Math.PI * Math.pow(valorRaio, 2);

		System.out.printf("O valor da área do circulo é %.4f", area);

		sc.close();
	}
}
