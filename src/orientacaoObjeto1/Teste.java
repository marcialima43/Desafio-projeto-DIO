package orientacaoObjeto1;

public class Teste {

	public static void main(String[] args) {
		
		Banco inter = new Banco();
		Banco brb = new Banco();
		inter.setNome("Banco Interamericano do Brasil");
		brb.setNome("Banco Regional de Brasília");
		Cliente cli = new Cliente();
		cli.setNome("Karina Barroso");
		Cliente cliPou = new Cliente();
		cliPou.setNome("Ulison Santos");
		
		
		Conta cc = new ContaCorrente(cli,inter);
		Conta poupanca = new Poupanca(cliPou, brb);
		
		cc.realizarDeposito(500);
		cc.realizarTransferencia(100, poupanca);
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
