package controleFluxo;
import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner terminal = new Scanner(System.in);
		
		System.out.println("Informe o primeiro parâmetro");
		int paraUm = terminal.nextInt();
		
		System.out.println("Informe o segundo parâmetro");
		int paramDois = terminal.nextInt();
		
		try {
			contar(paraUm, paramDois);
		} catch (ParametrosInvalidosException e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}

	}
	static void contar(int paramOne, int paramTwo) throws ParametrosInvalidosException {
		if(paramOne > paramTwo) throw new ParametrosInvalidosException();
		
		int contagem = paramTwo - paramOne;
		for(int i = 1; i<= contagem; i++) {
			System.out.println("Imprimindo o número " + i );
		}
		
	}

}
