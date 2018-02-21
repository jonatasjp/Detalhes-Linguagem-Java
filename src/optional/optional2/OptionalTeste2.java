package optional.optional2;

import java.util.Optional;

public class OptionalTeste2 {

	public static void main(String[] args) {

		Seguradora s = new Seguradora();

		filtrarComOptional(Optional.ofNullable(s));

		s.setNome("seguradora abc");

		filtrarComOptional(Optional.ofNullable(s));
		
		Pessoa p = new Pessoa();
		Carro c = new Carro();
		p.setCarro(c);
		p.setIdade(18);
		c.setSeguradora(s);
		
		System.out.println(obterSeguradoraEChecarPelaIdadePessoa(p, 20));
	}

	public static void filtrarComOptional(Optional<Seguradora> opSeguradora) {
		opSeguradora.filter((seguradora) -> {
			Optional<String> opNome = opSeguradora.map(Seguradora::getNome);
			return opNome.orElse("").equals("seguradora abc");
		}).ifPresent((seguradora) -> System.out.println(seguradora.getNome()));
	}
	
	public static String obterSeguradoraEChecarPelaIdadePessoa(Pessoa pessoa, int idadeMinima) {
		return Optional.ofNullable(pessoa).filter((p) -> p.getIdade() >= idadeMinima)
		.map( (p) -> p.getCarro())
		.map( (c) -> c.getSeguradora())
		.map( (s) -> s.getNome()).orElse("Essa pessoa não possui seguradora, favor verificar a idade");
	}
	
//	public static String obterSeguradoraEChecarPelaIdadePessoa(Pessoa pessoa, int idadeMinima) {
//		return Optional.ofNullable(pessoa).filter((p) -> p.getIdade() >= idadeMinima)
//		.map(Pessoa::getCarro)
//		.map(Carro::getSeguradora)
//		.map( (s) -> s.getNome()).orElse("Essa pessoa não possui seguradora, favor verificar a idade");
//	}

}
