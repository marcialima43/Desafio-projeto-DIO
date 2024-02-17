package Fundamentos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaCorrente {
	public static void main(String[] args) {
		

		  Scanner sc = new Scanner(System.in);
		  String nomeCliente = null;
		  int numConta = 0;
		  String agencia = null;
		  double saldo = 0;
		  
		 try {
			System.out.println("Informe o nome do titular da conta");
	        nomeCliente = sc.nextLine();

	        System.out.println("Informe o número da conta");
	        numConta = sc.nextInt();

	        System.out.println("Informe o número da agencia");
	        agencia = sc.next();

	        System.out.println("Informe o saldo da conta");
	       saldo = sc.nextDouble();
		   sc.close();
		 } catch (InputMismatchException e) {
			System.err.println("Formato do campo valor: 00,00");
		 }

	        
	        
	        System.out.println();
	        

	        System.out.println("Resumo da conta");
	        System.out.println("Conta: " + numConta);
	        System.out.println("Agencia: " + agencia);
	        System.out.println("Nome Cliente: " + nomeCliente);
	        System.out.println("Saldo: " + saldo);

	}

}
