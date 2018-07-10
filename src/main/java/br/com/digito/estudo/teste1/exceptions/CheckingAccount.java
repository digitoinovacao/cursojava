package br.com.digito.estudo.teste1.exceptions;

/**
 * Para demonstrar usando nossa exceção definida pelo usuário, a seguinte classe
 * CheckingAccount contém um método withdraw () que lança uma
 * InsufficientFundsException.
 * 
 * @author Antônio Gusmão
 *
 */
public class CheckingAccount {

	private double balance;
	private int number;

	public CheckingAccount(int number) {
		this.number = number;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) throws InsufficientFundsException {
		if (amount <= balance) {
			balance -= amount;
		} else {
			double needs = amount - balance;
			throw new InsufficientFundsException(needs);
		}
	}

	public double getBalance() {
		return balance;
	}

	public int getNumber() {
		return number;
	}
}
