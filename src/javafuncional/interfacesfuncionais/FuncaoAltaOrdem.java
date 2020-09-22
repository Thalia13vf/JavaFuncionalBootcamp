package javafuncional.interfacesfuncionais;

public class FuncaoAltaOrdem {
	public static void main(String[] args) {
		Calculo soma = (a, b) -> a + b;
		Calculo subtracao = (a, b) -> a -b;
		Calculo multiplicacao = (a, b) -> a * b;
		Calculo divisao = (a, b) -> a/b;
		
		System.out.println(executarOperacao(soma, 1, 3));//4
		System.out.println(executarOperacao(subtracao, 4, 3)); //1
		System.out.println(executarOperacao(multiplicacao, 5, 2)); //10
		System.out.println(executarOperacao(divisao, 20, 4)); //5
	}
	
	public static int executarOperacao
	(Calculo calculo, int n1, int n2) {
		return calculo.calcular(n1, n2); 
		//Função de alta ordem, pois recebe uma função
	}
}
@FunctionalInterface
interface Calculo{
	int calcular(int n1, int n2);
}