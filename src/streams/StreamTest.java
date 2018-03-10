package streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String[] args) {
		
		List<Pessoa> pessoas = Pessoa.bancoDePessoas();
		
		//obtendo a stream, filtrando pelas pessoas com idadde menor que 30, ordenando pelo nome, limitando a 3 registros
		//obtendo o stream de string com o nome das pessoas filtradas e gerando uma lista de string com os nomes.
		System.out.println( 
		pessoas.stream()
			.filter( pessoa -> pessoa.getIdade() < 30)
			.sorted(Comparator.comparing(Pessoa::getNome))
			.limit(3)
			.map(Pessoa::getNome)
			.collect(Collectors.toList()));
		
		//obtendo a stream, filtrando pelas pessoas com os salarios maiores que 4000, ordenando pelo salário, e gerando a lista de pessoas;
		System.out.println(
		pessoas.stream()
			.filter( (pessoa) -> pessoa.getSalario() > 4000)
			.sorted(Comparator.comparing(Pessoa::getSalario))
			.collect(Collectors.toList()) );

		//Contando quantidade de pessoas com idade maior que 30 anos
		System.out.println(pessoas
				.stream()
				.filter( pessoa -> pessoa.getIdade() > 25)
				.count());
		
		//Contando quantidade de pessoas com idade maior que 25 anos
		//com o uso do distinct as pessoas iguais(equals e hashcode) só serão contadas uma única vez
		System.out.println(pessoas
				.stream()
				.distinct()
				.filter( pessoa -> pessoa.getIdade() > 25)
				.count());
		
		//imprimindo a lista
		pessoas.stream().forEach(System.out::println);
		
		//obtendo a stream, filtrando pelas pessoas com idadde maior que 29, 
		//ordenando pelo nome, limitando a 3 registros e ignorando(skip) o primeiro registro
		//obtendo o stream de string com o nome das pessoas filtradas e 
		//gerando uma lista de string com os nomes.
		System.out.println( 
		pessoas.stream()
			.filter( pessoa -> pessoa.getIdade() > 29)
			.sorted(Comparator.comparing(Pessoa::getNome))
			.limit(3)
			.skip(1)
			.map(Pessoa::getNome)
			.collect(Collectors.toList()));
	}
}
