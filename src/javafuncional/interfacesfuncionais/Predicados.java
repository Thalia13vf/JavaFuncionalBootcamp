package javafuncional.interfacesfuncionais;

import java.util.function.Predicate;

public class Predicados {
	public static void main(String[] args) {
		Predicate<String> estaVazio = valor -> valor.isEmpty();
		Predicate<Integer> maiorQue2 = valor -> valor > 2; 
		Predicate<String> estaVazio2 = String::isEmpty;
		
		System.out.println(estaVazio.test(""));
		System.out.println(estaVazio.test("Teste"));
		System.out.println(maiorQue2.test(3));
		System.out.println(estaVazio2.test("Teste 2"));
	}
}
