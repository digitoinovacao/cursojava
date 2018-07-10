package br.com.digito.estudo.teste1.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.rmi.RemoteException;

import javax.naming.InsufficientResourcesException;

public class Excecoes {

	/**
	 * Uma exceção verificada é uma exceção que ocorre no momento da compilação,
	 * estas também são chamadas como exceções de tempo de compilação
	 */
	public void checkedException() {
		File file = new File("C:\\Users\\pb003111\\eclipse-workspace_photon\\teste1\\arq\\fila.txt");
		try {
			FileReader fr = new FileReader(file);
			int read = fr.read();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

		}
	}

	/**
	 * Uma exceção não verificada é uma exceção que ocorre no momento da execução.
	 */
	public void notCheckedException() {

		try {
			int num[] = { 1, 2, 3, 4, 5 };
			System.out.println(num[6]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception throw : " + e);
		}
	}

	/**
	 * Se um método não manipular uma exceção verificada, o método deve declará-lo
	 * usando a palavra-chave throws. A palavra-chave throws aparece no final da
	 * assinatura de um método. Você pode lançar uma exceção, uma recém-instanciada
	 * ou uma exceção que você acabou de capturar, usando a palavra-chave throw.
	 * Tente entender a diferença entre throws e throw keywords, throws é usado para
	 * adiar o tratamento de uma exceção verificada e throw é usado para invocar uma
	 * exceção explicitamente.
	 * 
	 * @throws RemoteException
	 */
	public void excecaoVerificada() throws RemoteException {

		throw new RemoteException();

	}

	/**
	 * As palavras-chave Throws / Throw
	 * 
	 * Um método pode declarar que ele lança mais de uma exceção, caso em que as
	 * exceções são declaradas em uma lista separada por vírgulas. Por exemplo, o
	 * método a seguir declara que ele lança um RemoteException e um
	 * InsufficientFundsException:
	 * 
	 * @param amount
	 * @throws RemoteException
	 * @throws InsufficientResourcesException
	 */
	public void withdraw(double amount) throws RemoteException, InsufficientResourcesException {
		// Method implementation
	}

	/**
	 * O uso de um bloco finally permite que você execute qualquer declaração de
	 * tipo de limpeza que você deseja executar, não importando o que aconteça no
	 * código protegido.
	 */
	public void blockFinaly() {

		int a[] = new int[2];

		try {
			System.out.println("Access element three :" + a[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception thrown  :" + e);
		} finally {
			a[0] = 6;
			System.out.println("First element value: " + a[0]);
			System.out.println("The finally statement is executed");
		}
	}

	/**
	 * Também chamado de gerenciamento automático de recursos, é um novo mecanismo
	 * de tratamento de exceções introduzido no Java 7, que fecha automaticamente os
	 * recursos usados no bloco try catch
	 */
	public void tryWithResource() {
		try (FileReader fr = new FileReader("E://file.txt")) {
			char[] a = new char[50];
			fr.read(a); // reads the contentto the array
			for (char c : a)
				System.out.print(c); // prints the characters one by one
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
