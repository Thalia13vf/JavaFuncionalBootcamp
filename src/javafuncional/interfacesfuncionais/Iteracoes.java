package javafuncional.interfacesfuncionais;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {
	public static void main(String[] args) {
		String nomes[] = {"Jose","Jose", "Paulo","Oliveira","Santos","Java"};
		//imprimeNomesFiltrados(nomes);
		imprimirTodosNomes(nomes);
		
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
}
