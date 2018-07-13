package br.com.digito.estudo.teste1.inner;

public class OuterDemo {

	private int num = 175;

	/**
	 * Classe Interna - é bem simples. Você só precisa escrever uma classe dentro de
	 * uma classe. Ao contrário de uma classe, uma classe interna pode ser privada
	 * e, quando você declara uma classe interna como privada, ela não pode ser
	 * acessada de um objeto fora da classe.
	 * 
	 */
	private class InnerDemo {
		public void print() {
			System.out.println("This is an inner class");
		}
	}

	void dissplayInner() {
		InnerDemo inner = new InnerDemo();
		inner.print();
	}

	/**
	 * Classes Internas - Também são usadas para acessar os membros privados de uma
	 * classe. Suponha que uma classe esteja tendo membros privados para acessá-los.
	 * 
	 */
	public class InneDemoLocal {

		public int getNum() {
			System.out.println("This is the getnum method of the inneer class");
			return num;
		}
	}
}
