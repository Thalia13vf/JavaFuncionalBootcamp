package javafuncional.interfacesfuncionais;

import java.util.function.Consumer;

public class Consumidores {
	public static void main(String[] args) {
		
		Consumer<String> imprimeFrase = System.out::println; //method reference
		Consumer<String> imprimeOutraFrase = frase -> System.out.println(frase);
		
		imprimeFrase.accept("Hello world");
		imprimeOutraFrase.accept("Java");
	}
}
