package orientacaoObjeto1;

public  abstract class Conta {
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	protected Banco banco;
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	
	
	public Conta(Cliente cliente, Banco banco) {
		
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.saldo = saldo;
		this.cliente = cliente;
		this.banco = banco;
	}
	public void realizarDeposito(double valor) {
		if(valor > 0) {
			 this.saldo = this.saldo + valor;
		}
		
	}
	public void realizarSaque(double valor) {
		if(valor > 0 && saldo > 0) {
			this.saldo = this.saldo - valor;
		}
		
	}
	public void realizarTransferencia(double valor, Conta contaDestino) {
		if(this.saldo > valor) {
			this.realizarSaque(valor);
		      contaDestino.realizarDeposito(valor);
		}
 	}
	protected void imprimirInfo() {
		System.out.println(String.format("%s%n", this.banco.getNome()));
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Número: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
	public abstract void imprimirExtrato();

}
