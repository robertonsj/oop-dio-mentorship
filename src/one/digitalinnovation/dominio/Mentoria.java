package one.digitalinnovation.dominio;

import java.time.LocalDateTime;

public class Mentoria extends Conteudo {

	private final int peso = 1;
	protected LocalDateTime datetime;
	
	public Mentoria(String titulo, String tutor, int duracao) {
		super(titulo, tutor, duracao);
		// TODO Auto-generated constructor stub
	}

	public void setDatetime(LocalDateTime localDateTime) {
		datetime = localDateTime;
	}
	

	@Override
	public double calcularXp(){
		// TODO Auto-generated method stub
		return getXP_PADRAO() * peso;
	}

	@Override
	public String toString() {
		StringBuilder info = new StringBuilder("------------ *** ------------\n");
		info.append("Mentoria" + super.toString() + "[Date and time=" + datetime + "]\n");
		return info.toString();
	}

	
	
	


}
