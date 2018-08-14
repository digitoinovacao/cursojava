package br.com.digito.estudo.teste1.lambda;

/**
 * 
 * As expressões lambda são usadas principalmente para definir a implementação
 * em linha de uma interface funcional, isto é, uma interface somente com um
 * único método.
 * 
 * A expressão Lambda elimina a necessidade de uma classe anônima e oferece uma
 * capacidade de programação funcional muito simples, porém poderosa, para o
 * Java.
 * 
 * @author Antôni Gusmão
 *
 */
public class Java8Tester {

	public static void main(String[] args) {
		Java8Tester tester = new Java8Tester();

		MathOperation addition = (int a, int b) -> a + b;

		MathOperation subtraction = (int a, int b) -> a - b;

		MathOperation multiplication = (int a, int b) -> a * b;

		MathOperation division = (int a, int b) -> a / b;

		System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
		System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
		System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
		System.out.println("10 / 5 = " + tester.operate(10, 5, division));

		// without parenthesis
		GreetingService greetService1 = message -> System.out.println("Hello " + message);

		// with parenthesis
		GreetingService greetService2 = (message) -> System.out.println("Hello " + message);

		greetService1.sayMessage("Mahesh");
		greetService2.sayMessage("Suresh");
	}

	interface MathOperation {
		int operation(int a, int b);
	}

	interface GreetingService {
		void sayMessage(String message);
	}

	private int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}

}
