package br.com.digito.estudo.teste1.exceptions;

/**
 * Você pode criar suas próprias exceções em Java. Tenha os seguintes pontos em
 * mente ao escrever suas próprias classes de exceção. Se você deseja gravar uma
 * exceção verificada que é aplicada automaticamente pela Handle ou Declare
 * Rule, é necessário estender a classe Exception.
 * 
 * 
 * @author Antônio Gusmão
 *
 */
public class InsufficientFundsException extends Exception {

	private static final long serialVersionUID = -7505731366452674901L;
	private double amount;

	public InsufficientFundsException(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}
}
