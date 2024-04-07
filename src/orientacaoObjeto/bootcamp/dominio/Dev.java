package orientacaoObjeto.bootcamp.dominio;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
	private String nome;
	private Set<Conteudo> conteudoInscrito = new LinkedHashSet<>();
	private Set<Conteudo> conteudoConcluido = new LinkedHashSet<Conteudo>();
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Set<Conteudo> getConteudoInscrito() {
		return conteudoInscrito;
	}
	public void setConteudoInscrito(Set<Conteudo> conteudoInscrito) {
		this.conteudoInscrito = conteudoInscrito;
	}
	public Set<Conteudo> getConteudoConcluido() {
		return conteudoConcluido;
	}
	public void setConteudoConcluido(Set<Conteudo> conteudoConcluido) {
		this.conteudoConcluido = conteudoConcluido;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null || getClass()!= obj.getClass()) return false;
		Dev dev = (Dev) obj;
		return Objects.equals(nome, dev.nome) && Objects.equals(conteudoInscrito, dev.conteudoInscrito) && Objects.equals(conteudoConcluido, dev.conteudoConcluido);
	}
	@Override
	public int hashCode() {
		
		return Objects.hash(nome, conteudoInscrito,conteudoConcluido);
	}
	public void inscreverBootCamp(Bootcamp bootcamp) {
		this.conteudoInscrito.addAll(bootcamp.getConteudos());
		bootcamp.getDevsInscritos().add(this);
	}
	public void progredir() {
		Optional<Conteudo> conteudo = this.conteudoInscrito.stream().findFirst();
		if(conteudo.isPresent()) {
			this.conteudoConcluido.add(conteudo.get());
			this.conteudoInscrito.remove(conteudo.get());
		}else {
			System.err.println("Aluno não matriculado em nenhum conteúdo!");
		}
	}
	public double calcularTotalXp() {
		Iterator<Conteudo> iterator = this.conteudoConcluido.iterator();
		double soma = 0;
		while(iterator.hasNext()) {
			double next = iterator.next().calcularXp();
			soma += next;
		}
		return soma;
	}
	
 
}
