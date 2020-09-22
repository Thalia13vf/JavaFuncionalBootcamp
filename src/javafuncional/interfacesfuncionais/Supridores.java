package javafuncional.interfacesfuncionais;

import java.util.function.Supplier;

public class Supridores {
	public static void main(String[] args) {
		Supplier<Pessoa> instanciaPessoa = () -> new Pessoa();
		Supplier<Pessoa> instancia = Pessoa::new;
		
		System.out.println(instanciaPessoa.get());
		System.out.println(instancia.get());
	}
}

class Pessoa{
	private String nome;
	private Integer idade;
	
	public Pessoa() {
		this.nome = "Thalia";
		this.idade = 22;
	}
	
	public String toString() {
		return String.format("Nome  %s,  Idade %d", nome, idade);
	}
}