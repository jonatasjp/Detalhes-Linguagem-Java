package streams;

import java.util.Comparator;
import java.util.List;

/**
 * Finding and matching 
 */
public class StreamTest02 {
	
	public static void main(String[] args) {
		
		List<Pessoa> pessoas = Pessoa.bancoDePessoas();
		
		//Retorna true se pelo menos uma ocorrência do predicate no método anyMatch retornar true
		System.out.println(pessoas.stream().anyMatch( pessoa -> pessoa.getSalario() > 4000));
		//Retorna true se todas as ocorrências do predicate no método allMatch retornar true
		System.out.println(pessoas.stream().allMatch( pessoa -> pessoa.getIdade() > 10));
		//Retorna true se todas as ocorrências do predicate no método allMatch retornar false
		System.out.println(pessoas.stream().noneMatch( pessoa -> pessoa.getSalario() < 2000));
		
		//retorna o optional do objeto da lista, se nenhum objeto da lista estiver dentro
		//do filtro especificado no filter retorna um optional empty
		pessoas.stream().filter( pessoa -> pessoa.getSalario() > 4000)
			.findAny().ifPresent(System.out::println);
		
		//retorna o optional do primeiro objeto encontrado na lista que satisfaça o filtro no filter
		//se nenhum objeto da lista estiver dentro
		//do filtro especificado no filter retorna um optional empty
		pessoas.stream().filter( pessoa -> pessoa.getSalario() > 2000)
			.sorted(Comparator.comparing(Pessoa::getIdade).reversed())
			.findFirst().ifPresent(System.out::println);
		
	}
}
