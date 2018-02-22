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
		
	}
}
