package lambdas.methodReference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;

import generics.classes.Carro;

public class MethodReference {

	public static void main(String[] args) {
		
		List<Carro> carros = Arrays.asList(new Carro("gol", "vermelho"), new Carro("bmw", "preto"),
				new Carro("gol", "amarelo"), new Carro("jetta", "vermelho"));

		// referência a método estático
		Collections.sort(carros, ComparadorCarro::compararPelaCor);
		System.out.println(carros);
		
		// referência de método para um método de instância de um objeto de um tipo específico.
		ComparadorCarro comparador = new ComparadorCarro();
		Collections.sort(carros, comparador::compararPeloNome);
		System.out.println(carros);
		
		//Referência a um método de instância de um objeto arbitrário de um tipo específico
		List<String> nomes = Arrays.asList("jonatas", "andré", "joao", "railda");
		nomes.sort(String::compareTo);
		System.out.println(nomes);
		
		Function<String, Integer> stringParaInteger = Integer::parseInt;
		System.out.println(stringParaInteger.apply("5"));
		
		BiPredicate<List<String>, String> contains = List::contains;
		System.out.println(contains.test(nomes, "jonatas"));
		
		//Referência a um construtor
		Supplier<ComparadorCarro> comparadorCarro = ComparadorCarro::new;
		//Instancia do comparador
		System.out.println(comparadorCarro.get());
		
	}
	
}
