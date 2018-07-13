package br.com.digito.estudo.teste1.inner;

/**
 * Classe aninhada estática - é uma classe interna estática é uma classe
 * aninhada que é um membro estático da classe externa. Ele pode ser acessado
 * sem instanciar a classe externa, usando outros membros estáticos. Assim como
 * os membros estáticos, uma classe aninhada estática não tem acesso às
 * variáveis da instância e aos métodos da classe externa
 * 
 * @author Antônio Gusmão
 *
 */
public class MyOuter {

	static class NestedDemo {
		public void metodoNested() {
			System.out.println("This is my nested class");
		}
	}
}
