package br.com.digito.estudo.teste1.inner;

public class OuterClass {

	/**
	 * Classe Interna Método-local - Em Java, podemos escrever uma classe dentro de
	 * um método e isso será um tipo local. Como as variáveis locais, o escopo da
	 * classe interna é restrito no método. Uma classe interna local de método pode
	 * ser instanciada somente dentro do método onde a classe interna é definida. O
	 * programa a seguir mostra como usar uma classe interna local do método.
	 */
	void meuMetodo() {
		final int num = 23;

		class MetodoInnerDemo {
			public void print() {
				System.out.println("This is method inner class " + num);
			}
		}
		MetodoInnerDemo inner = new MetodoInnerDemo();
		inner.print();
	}

}
