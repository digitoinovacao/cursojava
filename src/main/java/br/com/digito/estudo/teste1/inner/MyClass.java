package br.com.digito.estudo.teste1.inner;

/**
 * Classe Interna Anônima como Argumento - Geralmente, se um método aceita um
 * objeto de uma interface, uma classe abstrata ou uma classe concreta, podemos
 * implementar a interface, estender a classe abstrata e passar o objeto para o
 * método. Se é uma classe, então podemos passá-la diretamente para o método.
 * 
 * @author Antônio Gusmão
 *
 */
public class MyClass {

	public void displayMessage(Message m) {
		System.out.println(m.greet() + ", This is an example of anonymous inner class as an argument");
	}
}
