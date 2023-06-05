/**
 * 
 */
package poo.entities;

/**
 * Classe que cria uma conta bancaria e le as informacoes do titular.
 * 
 * Permite realizar saques e depositos e exibe o saldo.
 * 
 * @author Matos
 *
 */
public class Conta {

	private int numero;
	private String titular;
	private double valorDeposito = 0.0;
	private double saldo = 0.0;
	private static final double TAXA_SAQUE = 5.00;

	public Conta(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
	}

	public Conta(int numero, String titular, double valorDepositoInicial) {
		this.numero = numero;
		this.titular = titular;
		deposito(valorDepositoInicial);
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getValorDeposito() {
		return valorDeposito;
	}

	public void setValorDeposito(double valorDeposito) {
		this.valorDeposito = valorDeposito;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void saque(double valorSaque) {
		saldo -= (valorSaque + TAXA_SAQUE);
	}

	public void deposito(double valorDep) {
		this.saldo += valorDep;
	}

	public String toString() {
		return "\nAccount " + numero + " , " 
				+ "Holder: " + titular + " , " 
				+ "Balance: $ " + String.format("%.2f", saldo);
	}

}
