package basico;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		System.out.println("Qual o valor do raio?");
		
		Scanner sc = new Scanner(System.in);
		
		double valorRaio = sc.nextDouble();
		double area = Math.PI*(valorRaio);
		
		System.out.printf("O valor da área do circulo é %.4f", area);
		
		sc.close();
	}
}
