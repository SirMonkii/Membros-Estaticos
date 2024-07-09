package application;

import java.util.Scanner;

public class Program {

	public static final double PI = 3.14159;
	// A palavra final indica que essa variável é uma constante, ela nunca irá
	// mudar.

	public static void main(String[] args) {
		// Versão 1 métodos na própria classe do programa principal.

		// Ter definido os métodos na própria classe do programa nos força a definir os
		// métodos como static, caso contrário, não é possível chamá-los.

		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com o valor do raio ");
		double radius = sc.nextDouble();

		double c = circumference(radius);

		double v = volume(radius);

		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", PI);

		sc.close();
	}

	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}

	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}

}
