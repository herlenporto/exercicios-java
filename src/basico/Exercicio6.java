package basico;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c;
		
		System.out.println("Quais valores você deseja?");
		
		a = sc.nextDouble(); 
		b = sc.nextDouble(); 
		c = sc.nextDouble();
		
		double areaTriangulo = a * c /2;
		double areaCirculo = Math.PI*Math.pow(c, 2);
		double areaTrapezio = (a + b) * c/2;
		double areaQuadrado = b * b;
		double areaRetangulo = a * b;
		
		System.out.printf("Triangulo: %.3f%n", areaTriangulo);
		System.out.printf("Circulo: %.3f%n", areaCirculo);
		System.out.printf("Trapezio: %.3f%n", areaTrapezio);
		System.out.printf("Quadrado: %.3f%n", areaQuadrado);
		System.out.printf("Retangulo: %.3f%n", areaRetangulo);
		
		sc.close();
	}
}
