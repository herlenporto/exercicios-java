package basico;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		System.out.println("Informe n�mero, horas trabalhadas e valor por hora:");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, hora;
		double valor;
		
		n = sc.nextInt();
		hora = sc.nextInt();
		valor = sc.nextDouble();
		
		double salario = hora * valor;
		
		System.out.printf("N�mero: %d%n", n);
		System.out.printf("Sal�rio: U$ %.2f", salario);
		
		sc.close();
		}
}
