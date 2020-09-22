package javafuncional.interfacesfuncionais;

import java.util.function.Function;

public class Funcoes {
	public static void main(String[] args) {
		Function<String, String> retornaNomeContrario = 
				texto -> new StringBuilder(texto).reverse().toString();
				
		System.out.println(retornaNomeContrario.apply("Thalia"));		
		
		Function<String, Integer> converterStringParaIntegerDobro =
				string -> Integer.valueOf(string) * 2;
		System.out.println(converterStringParaIntegerDobro.apply("20"));		
		
		Function<String, Integer> converterStringParaInteger =
				Integer::valueOf;
		System.out.println(converterStringParaInteger.apply("2"));
		
	}
}
