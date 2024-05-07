package one.digitalinnovation.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Bootcamp {

	private String titulo;
	private LocalDate inicio;
	private LocalDate fim;
	private List<Conteudo> listaDeConteudos;
	private List<Dev> devs;

	public Bootcamp(String titulo, LocalDate inicio, int weeks) {
		this.titulo = titulo;
		this.inicio = inicio;
		this.fim = inicio.plusWeeks(weeks);
		this.listaDeConteudos = new ArrayList<>();
		this.devs = new ArrayList<>();
	}
	
	public List<Conteudo> getListaDeConteudos() {
		return listaDeConteudos;
	}


	@Override
	public String toString() {
		StringBuilder conteudos = new StringBuilder("============ *** ============\n");
		conteudos.append("Bootcamp - "+ titulo.toUpperCase() + "\n[Inicio=" + inicio + ", Fim="+ fim+"]\n");
	
		conteudos.append("Conteudos do Bootcamp:\n");
		for(Conteudo conteudo : listaDeConteudos) {
			conteudos.append("\t* " + conteudo.getTitulo() + "\n");
		}
		return conteudos.toString();
		}

	

}
