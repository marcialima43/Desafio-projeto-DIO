package orientacaoObjeto.bootcamp.dominio;

public class Curso extends Conteudo{
	
	private int cargaHoraria;
	
	public Curso() {
		
	}
	
	

	public int getCargaHoraria() {
		return cargaHoraria;
	}



	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}



	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return XP_PADRAO * cargaHoraria;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Curso{" + 
				"titulo = '" + getTitulo() + '\'' +
				", descrição = '"+ getDescricao() + '\'' +
				", Carga Horária = '" + cargaHoraria + 
				'}';
	}

}
