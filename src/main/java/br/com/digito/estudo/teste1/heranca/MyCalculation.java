package br.com.digito.estudo.teste1.heranca;

/**
 * A herança pode ser definida como o processo em que uma classe adquire as
 * propriedades (métodos e campos) de outra. Com o uso de herança, as
 * informações são geridas em ordem hierárquica.
 * 
 * @author Antônio Gusmão
 *
 */
public class MyCalculation extends Calculation {

	public void multiplication(int x, int y) {
		z = x * y;
		System.out.println("The product of the given numbers:" + z);
	}

	public static void main(String args[]) {
		int a = 20, b = 10;
		MyCalculation demo = new MyCalculation();
		demo.addition(a, b);
		demo.Subtraction(a, b);
		demo.multiplication(a, b);
	}
}
