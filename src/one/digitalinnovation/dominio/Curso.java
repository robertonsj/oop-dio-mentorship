package one.digitalinnovation.dominio;

public class Curso extends Conteudo {
	
	private final int peso = 2;

	public Curso(String titulo, String tutor, int duracao) {
		super(titulo,tutor, duracao);
		// TODO Auto-generated constructor stub
	}


	@Override
	public double calcularXp() {
		return getXP_PADRAO() * peso;
	}

	@Override
	public String toString() {
		StringBuilder info = new StringBuilder("------------ *** ------------\n");
		info.append("Curso" +  super.toString());
		return info.toString();
	}
	
	
}
