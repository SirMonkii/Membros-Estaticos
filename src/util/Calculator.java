//Classe referente ao Program2

package util;

public class Calculator {

	public final double PI = 3.14159;
	// A palavra final indica que essa variável é uma constante, ela nunca irá
	// mudar.

	// Pelos métodos estarem dentro da classe calculator, não é necessário definir
	// os métodos como static

	public double circumference(double radius) {
		return 2.0 * PI * radius;
	}

	public double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}

}
