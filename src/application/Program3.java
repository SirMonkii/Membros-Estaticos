package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator3;

public class Program3 {

	public static void main(String[] args) {
		// Versão 3 metódos na classe Calculator

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com o valor do raio ");
		double radius = sc.nextDouble();

		double c = Calculator3.circumference(radius);

		double v = Calculator3.volume(radius);

		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator3.PI);

		sc.close();
	}

}
