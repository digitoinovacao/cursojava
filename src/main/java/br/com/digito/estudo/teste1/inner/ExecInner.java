package br.com.digito.estudo.teste1.inner;

public class ExecInner {

	public static void main(String[] args) {

		// Classe interna
		OuterDemo outer = new OuterDemo();
		outer.dissplayInner();

		// Classe Interna(Membros privados)
		OuterDemo.InneDemoLocal inner = outer.new InneDemoLocal();
		System.out.println(inner.getNum());

		// Classe Interna Método-local
		OuterClass outerClass = new OuterClass();
		outerClass.meuMetodo();

		// Classe Interna Anônima
		AnonymousInner annInner = new AnonymousInner() {

			@Override
			public void meuMetodo() {
				System.out.println("This is an example of anonymous inner class");
			}
		};
		annInner.meuMetodo();

		// Classe Interna Anônima(como Argumento)
		MyClass obj = new MyClass();
		obj.displayMessage(new Message() {

			@Override
			public String greet() {
				return "Hello";
			}
		});

		// Classe aninhada estática
		MyOuter.NestedDemo nested = new MyOuter.NestedDemo();
		nested.metodoNested();

	}
}
