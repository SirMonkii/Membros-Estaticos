package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program2 {

	public static void main(String[] args) {
		// Versão 2 metódos na classe Calculator.

		// Ter definido os métodos na classe calculator nos possibilita não precisar
		// definir os métodos com static, porém, temos que iniciar um novo objeto para
		// os métodos poderem ser chamados.

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Calculator calc = new Calculator();

		System.out.print("Entre com o valor do raio ");
		double radius = sc.nextDouble();

		double c = calc.circumference(radius);

		double v = calc.volume(radius);

		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calc.PI);

		sc.close();
	}

}
