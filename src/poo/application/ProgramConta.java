/**
 * 
 */
package poo.application;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

import poo.entities.Conta;

/**
 * Classe de teste - Conta
 * 
 * @author Matos
 *
 */
public class ProgramConta {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conta conta1;
		
		System.out.print("Enter account number: ");
		int numeroConta = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String titular = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n): ");
		char opcao = sc.next().charAt(0);
		
		double valorDeposito;
		
		if((opcao == 'Y') || (opcao == 'y')) {
			System.out.print("Enter initial deposit value: ");
			valorDeposito = sc.nextDouble();
			conta1 = new Conta(numeroConta, titular, valorDeposito);
		} else {
			conta1 = new Conta(numeroConta, titular);
		}
		
		System.out.println("\nAccount data: " + conta1.toString());
	
		//realiza deposito
		System.out.print("\nEnter a deposit value: ");
		double novoDeposito = sc.nextDouble();
		conta1.deposito(novoDeposito);
		
		System.out.print("\nUpdated account data: ");
		System.out.println(conta1.toString());
		
		//realiza saque
		System.out.print("\nEnter a withdraw value: ");
		double valorSaque = sc.nextDouble();
		conta1.saque(valorSaque);
		
		System.out.print("\nUpdated account data: ");
		System.out.println(conta1.toString());
		
		
		sc.close();

	}

}
