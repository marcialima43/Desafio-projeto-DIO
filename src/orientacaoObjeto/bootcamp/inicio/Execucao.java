package orientacaoObjeto.bootcamp.inicio;

import java.time.LocalDate;

import orientacaoObjeto.bootcamp.dominio.Bootcamp;
import orientacaoObjeto.bootcamp.dominio.Curso;
import orientacaoObjeto.bootcamp.dominio.Dev;
import orientacaoObjeto.bootcamp.dominio.Mentoria;

public class Execucao {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAluno = new Dev();
        devAluno.setNome("Camila");
        devAluno.inscreverBootCamp(bootcamp);
        System.out.println("Conteúdos inscritos para o aluno: " + devAluno.getConteudoInscrito());
        devAluno.progredir();
        devAluno.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos: " + devAluno.getConteudoInscrito());
        System.out.println("Conteúdos concluídos para o Aluno: " + devAluno.getConteudoConcluido());
        System.out.println("XP: " + devAluno.calcularTotalXp());
        


	}

}
