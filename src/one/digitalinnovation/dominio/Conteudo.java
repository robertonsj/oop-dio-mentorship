package one.digitalinnovation.dominio;

public abstract class Conteudo {

	private final double XP_PADRAO = 10.0;
	
	private String titulo;
	private String tutor;
	private int duracao;
	private String status;
	
	public Conteudo(String titulo, String tutor, int duracao) {
		this.titulo = titulo;
		this.tutor = tutor;
		this.duracao = duracao;
	}

	public abstract double calcularXp();
	

	public String getTitulo() {
		return titulo;
	}

	public double getXP_PADRAO() {
		return XP_PADRAO;
	}

	@Override
	public String toString() {
		return " - " + titulo.toUpperCase() + "\n[Tutor=" + tutor + ", Duracao=" + duracao 
				+ ", XP=" + calcularXp() + "]\n";
	}
	
	

}
