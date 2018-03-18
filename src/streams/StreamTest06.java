package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Agrupamento
 * */
public class StreamTest06 {

	public static void main(String[] args) {
		
		List<Pessoa> pessoas = Pessoa.bancoDePessoas();
		
		/*Agrupando da maneira antiga, e agrupando com streams*/
		agrupandoManeiraAntiga(pessoas);
		pessoas.stream().collect(Collectors.groupingBy(Pessoa::getGenero));
		
		/*agrupando pela condição de maior idade ou menor idade*/
		Map<Maioridade, List<Pessoa>> mapPessoas = pessoas.stream().collect(Collectors.groupingBy(p -> {
			return p.getIdade() > 18 ? Maioridade.ADULTO : Maioridade.MENORDEIDADE;
		}));
		System.out.println(mapPessoas);
		
		/*agrupando pelo genero e também pela maior idade e menor idade*/
		Map<Genero, Map<Maioridade, List<Pessoa>>> mapGeneroEMaioridade = pessoas.stream().collect(Collectors.groupingBy(Pessoa::getGenero, Collectors.groupingBy(p -> {
			return p.getIdade() > 18 ? Maioridade.ADULTO : Maioridade.MENORDEIDADE;
		})));
		System.out.println(mapGeneroEMaioridade);
		
		/*agrupando pelo genero e contando*/
		Map<Genero, Long> mapGeneroQuantidade = pessoas.stream().collect(Collectors.groupingBy(Pessoa::getGenero, Collectors.counting()));
		System.out.println(mapGeneroQuantidade);
		
		/*agrupando pelo genero e trazendo o de maior salário por genero com optional*/
		Map<Genero, Optional<Pessoa>> mapGeneroMaiorSalario = 
				pessoas.stream().collect(Collectors.groupingBy(Pessoa::getGenero, Collectors.maxBy(Comparator.comparing(Pessoa::getSalario))));
		System.out.println(mapGeneroMaiorSalario);
		
		/*agrupando pelo genero e trazendo o de maior salário por genero sem optional*/
		Map<Genero, Pessoa> mapGeneroMaiorSalario2 = pessoas.stream().collect(Collectors.groupingBy(Pessoa::getGenero, 
				Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Pessoa::getSalario)), Optional::get)));
		System.out.println(mapGeneroMaiorSalario2);
		
		/*agrupando por genero e obtendo estatisticas*/
		Map<Genero, DoubleSummaryStatistics> collect = 
				pessoas.stream().collect(Collectors.groupingBy(Pessoa::getGenero, Collectors.summarizingDouble(Pessoa::getSalario)));
		System.out.println(collect);
	}

	public static void agrupandoManeiraAntiga(List<Pessoa> pessoas) {
		Map<Genero, List<Pessoa>> pessoasGeneroMap = new HashMap<>();
		
		List<Pessoa> masculinos = new ArrayList<>();
		List<Pessoa> femininos = new ArrayList<>();
		
		for (Pessoa pessoa : pessoas) {
			if(pessoa.getGenero().equals(Genero.MASCULINO)) {
				masculinos.add(pessoa);
			} else {
				femininos.add(pessoa);
			}
		}

		pessoasGeneroMap.put(Genero.MASCULINO, masculinos);
		pessoasGeneroMap.put(Genero.FEMININO, femininos);
	}
	
	
}
