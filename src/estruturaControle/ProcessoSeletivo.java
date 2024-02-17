package estruturaControle;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

	public static void main(String[] args) {
		
		//selecaoCandidato();
		//imprimirSeleciondos();
		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
		for(String candidato : candidatos) {
			entrandoEmContado(candidato);
			
		}
		

	}
	static void entrandoEmContado(String candidato) {
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		
		do {
			atendeu = atender();
			continuarTentando = !atendeu;
			if(continuarTentando)
				tentativasRealizadas++;
			else
				System.out.println("Contato realizado com sucesso");
		}while(continuarTentando && tentativasRealizadas < 3);
		
		if(atendeu)
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA");
		else
			System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
			
	}
	static boolean atender() {
		return new Random().nextInt(3)== 1;
	}
	static void imprimirSeleciondos() {
		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
		System.out.println("Lista de candidatos informando o índice do elemento");
		
		for(int indice = 0; indice < candidatos.length; indice++) {
			System.out.println("O candidato de nº " + (indice + 1) + " é o " + candidatos[indice]);
		}
	}
	static void selecaoCandidato() {
		double salarioBase = 2000.0;
		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
		int totalSelecionados = 0;
		int proximoCandidato = 0;
		while(totalSelecionados < 5 && proximoCandidato < candidatos.length) {
			String candidato = candidatos[proximoCandidato];
			double valorPretendido = valorPretendido();
			//"Pretensão salarial do candidato " + candidato + " = " + valorPretendido
			System.out.printf("Pretansão salarial do candidato: %s é %.2f%n", candidato, valorPretendido);
			if(valorPretendido > salarioBase ) {
				System.out.println("Candidato " + candidato + " não foi selecionado");
				System.out.println("==================================================");
			}else {
				System.out.println("Candidato " + candidato + " continua no processo seletivo");
				System.out.println("==================================================");
				totalSelecionados++;
			}
			proximoCandidato++;
			
		}
		System.out.println("Total selecionados: " + totalSelecionados);
		System.out.println("Total de candidatos consultados: " + proximoCandidato);
	}
	
	static void analisarCandidato(double salarioBase,double pretensaoSalarial) {
		if(salarioBase > pretensaoSalarial) System.out.println("Ligar para o candidato");
		else if(salarioBase == pretensaoSalarial) System.out.println("Ligar para o candidato, com contra proposta");
		else System.out.println("Aguardando resultado dos demais candidatos");
		
	}
	static double valorPretendido() {
		return  ThreadLocalRandom.current().nextDouble(1800,2200);
		//double numeroFormatado = formatarNumero(numero);
		//return numeroFormatado;
	}
	static String formatarNumero(double numero) {
		DecimalFormat formatar = new DecimalFormat("#,##");
		String numeroFormatado = formatar.format(numero);
		return numeroFormatado;
		
	}

}
