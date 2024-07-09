package util;

public class Calculator3 {

	public static final double PI = 3.14159;
	// A palavra final indica que essa variável é uma constante, ela nunca irá
	// mudar.

	// Pelos métodos estarem dentro da classe calculator, não é necessário definir
	// os métodos como static

	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}

	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}

}
