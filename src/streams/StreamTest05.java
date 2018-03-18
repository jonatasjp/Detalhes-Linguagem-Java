package streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Collectors
 * */
public class StreamTest05 {

	public static void main(String[] args) {
		
		List<Pessoa> pessoas = Pessoa.bancoDePessoas();
		
		/*Contando sem collectors e com collectors*/
		System.out.println(pessoas.stream().count());
		System.out.println(pessoas.stream().collect(Collectors.counting()));

		/*Obtendo o maior de acordo com o especificado no comparator sem collectors e com collectors*/
		System.out.println(pessoas.stream().max(Comparator.comparing(Pessoa::getSalario)).get());
		System.out.println(pessoas.stream().collect(Collectors.maxBy(Comparator.comparing(Pessoa::getSalario))).get());
		
		/*Obtendo o menor de acordo com o especificado no comparator sem collectors e com collectors*/
		System.out.println(pessoas.stream().min(Comparator.comparing(Pessoa::getSalario)).get());
		System.out.println(pessoas.stream().collect(Collectors.minBy(Comparator.comparing(Pessoa::getSalario))).get());
		
		/*Somando os salarios sem collectors e com collectors*/
		System.out.println(pessoas.stream().mapToDouble(Pessoa::getSalario).sum());
		System.out.println(pessoas.stream().collect(Collectors.summingDouble(Pessoa::getSalario)));
		
		/*Média dos salarios sem collectors e com collectors*/
		System.out.println(pessoas.stream().mapToDouble(Pessoa::getSalario).average().getAsDouble());
		System.out.println(pessoas.stream().collect(Collectors.averagingDouble(Pessoa::getSalario)));
		
		/*obtém operações de count, sum, min, max e average*/
		System.out.println(pessoas.stream().collect(Collectors.summarizingDouble(Pessoa::getSalario)));
	
		/*juntando o nome de todas as pessoas separando por virgula e espaço*/
		System.out.println(pessoas.stream().map(Pessoa::getNome).collect(Collectors.joining(", ")));
	}
	
}
