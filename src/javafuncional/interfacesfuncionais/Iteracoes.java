package javafuncional.interfacesfuncionais;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {
	public static void main(String[] args) {
		String nomes[] = {"Jose","Jose", "Paulo","Oliveira","Santos","Java"};
		Integer[] numeros = {1, 2, 3, 4, 5};
		//imprimeNomesFiltrados(nomes);
		//imprimirTodosNomes(nomes);
		imprimirDobroDeCadaItemDaLista(numeros);
		
		List<String> profissoes = new ArrayList<>();
		profissoes.add("Desenvolvedor");
		profissoes.add("Testador");
		profissoes.add("Gerente de projetos");
		profissoes.add("Gerente de qualidade");
		
		profissoes.stream()
			.filter(profissao -> profissao.startsWith("Gerente")).forEach(System.out::println);
		
	}
	public static void imprimeNomesFiltrados(String... nomes) {
		String nomesParaImprimir = "";
		
		for(int i = 0; i < nomes.length; i++) {
			if(nomes[i].equals("Jose")) {
				nomesParaImprimir =" " + nomes[i];
			}
		}
		System.out.println(nomesParaImprimir);
		
		String nomeFiltrado = Stream.of(nomes)
		.filter(nome -> nome.equals("Jose"))
		.collect(Collectors.joining());
		 
		System.out.println(nomeFiltrado);

	}
	public static void imprimirTodosNomes(String... nomes) {
		for(String nome : nomes) {
			System.out.println("for " + nome);
		}
		System.out.println();
		Stream.of(nomes).forEach(nome -> System.out.println("For each " + nome));
	}
	
	public static void imprimirDobroDeCadaItemDaLista(Integer...numeros) {
		for(Integer numero : numeros) {
			System.out.println(numero * 2);
		}
		Stream.of(numeros).map(numero -> numero * 2)
			.forEach(System.out::println);
	}
}
