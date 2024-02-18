package orientacaoObjeto1;

public class Poupanca extends Conta {

	public Poupanca(Cliente cliente, Banco banco) {
		super(cliente, banco);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=======Extrato Conta Poupança=======");
		System.out.println();
		super.imprimirInfo();
		
	}

	

}
