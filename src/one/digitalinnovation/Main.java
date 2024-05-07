package one.digitalinnovation;

import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import one.digitalinnovation.dominio.Bootcamp;
import one.digitalinnovation.dominio.Conteudo;
import one.digitalinnovation.dominio.Curso;
import one.digitalinnovation.dominio.Dev;
import one.digitalinnovation.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		List<Conteudo> catalogoDaDio = new ArrayList<>();
		Bootcamp bootcamp = new Bootcamp(
				"Formação Java Developer", LocalDate.of(2024, 01, 20), 8
		);
		
		catalogoDaDio.add(new Curso("Agile Methodology", "Renan Oliveira", 30));
		catalogoDaDio.add(new Curso("Java Basico", "Gleyson Sampaio", 50));
		catalogoDaDio.add(new Curso("Java POO", "Gleyson Sampaio", 40));
		catalogoDaDio.add(new Curso("Algorithm and DataStructure", "Gleyson Sampaio", 40));
		catalogoDaDio.add(new Mentoria("GFT Start #2 Java", "Venilton Falvo", 2));
		
		Mentoria mentoria = new Mentoria("GFT Start #3 Java", "Renan Oliveira", 3);
		mentoria.setDatetime(LocalDateTime.of(2024, 2, 10, 10, 30));
		catalogoDaDio.add(mentoria);
		
		bootcamp.getListaDeConteudos().add(catalogoDaDio.get(2));
		bootcamp.getListaDeConteudos().add(catalogoDaDio.get(3));
		bootcamp.getListaDeConteudos().add(catalogoDaDio.get(4));
		
		/*
		System.out.println(String.format("XP Felip�o: %.2f", felipao.calcularTotalXp()));
		System.out.println(String.format("XP Venilton: %.2f", venilton.calcularTotalXp()));
		
		List<Dev> ranking = Arrays.asList(felipao, venilton).stream()
								  .sorted((dev1, dev2) -> Double.compare(dev2.calcularTotalXp(), dev1.calcularTotalXp()))
								  .collect(Collectors.toList());
		
		for (Dev dev : ranking) {
			System.out.println(dev.getNome());
		}
		*/
		
		catalogoDaDio.stream().forEach(System.out::println);
		System.out.println(bootcamp);
	}

}
