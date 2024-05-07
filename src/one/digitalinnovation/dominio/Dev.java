package one.digitalinnovation.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Dev {

	private String nome;
	private List<Conteudo> studyingList = new ArrayList<>();
	private List<Conteudo> finishedStudyingList = new ArrayList<>();

	public void addToStudyingList(Conteudo conteudo) {
		if (studyingList.contains(conteudo)) {
			System.err.println("The content has already been added.");
		} else {
			studyingList.add(conteudo);
		}
	}

	/*
	public void addToStudyingList(Bootcamp bootcamp) {
		// Alternativa 1: foreach tradicional.
		for (Conteudo conteudo : bootcamp.getConteudos()) {
			addToStudyingList(conteudo);
		}
		bootcamp.getDevs().add(this);
		// Alternativa 2: API de Stream.
		//bootcamp.getConteudos().stream().forEach(this::inscrever);
	}
	*/

	public void progredir() {
		Optional<Conteudo> conteudo = studyingList.stream().findFirst();
		if (conteudo.isPresent()) {
			finishedStudyingList.add(conteudo.get());
			studyingList.remove(conteudo.get());
		} else {
			System.err.println("Voc� n�o est� mais inscrito em nenhum conte�do.");
		}
	}
	
	public double calcularTotalXp() {
		return finishedStudyingList.stream()
				.mapToDouble(conteudo -> conteudo.calcularXp())
				.sum();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
