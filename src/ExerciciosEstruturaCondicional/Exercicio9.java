package ExerciciosEstruturaCondicional;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("Qual o tamanho do arquivo em Bytes?");

		long arquivo = sc.nextLong();

		if (arquivo < 1024) {
			System.out.printf(new DecimalFormat("#.00").format(arquivo) + " B");
		} else if (arquivo < Math.pow(1024, 2)) {
			double total = arquivo / 1024.0;
			System.out.printf(new DecimalFormat("#.00").format(total) + " KB");
		} else if (arquivo < Math.pow(1024, 3)) {
			double total = arquivo / Math.pow(1024, 2);
			System.out.printf(new DecimalFormat("#.00").format(total) + " MB");
		} else if (arquivo < Math.pow(1024, 4)) {
			double total = arquivo / Math.pow(1024, 3);
			System.out.printf(new DecimalFormat("#.00").format(total) + " GB");
		} else if (arquivo < Math.pow(1024, 5)) {
			double total = arquivo / Math.pow(1024, 4);
			System.out.printf(new DecimalFormat("#.00").format(total) + " TB");
		} else if (arquivo < Math.pow(1024, 6)) {
			double total = arquivo / Math.pow(1024, 5);
			System.out.printf(new DecimalFormat("#.00").format(total) + " PB");
		} else if (arquivo < Math.pow(1024, 7)) {
			double total = arquivo / Math.pow(1024, 6);
			System.out.printf(new DecimalFormat("#.00").format(total) + " EB");
		} else if (arquivo < Math.pow(1024, 8)) {
			double total = arquivo / Math.pow(1024, 7);
			System.out.printf(new DecimalFormat("#.00").format(total) + " ZB");
		} else if (arquivo < Math.pow(1024, 9)) {
			double total = arquivo / Math.pow(1024, 8);
			System.out.printf(new DecimalFormat("#.00").format(total) + " YB");
		}
		sc.close();
	}

}
