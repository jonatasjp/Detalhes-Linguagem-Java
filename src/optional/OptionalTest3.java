package optional;

import java.util.Optional;

public class OptionalTest3 {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		
		System.out.println(obterNomeSeguradora(Optional.ofNullable(p)));
		
		Carro c = new Carro();
		p.setCarro(c);
		Seguradora s = new Seguradora();
		c.setSeguradora(s);
		s.setNome("seguradora abc");
		
		System.out.println(obterNomeSeguradora(Optional.ofNullable(p)));
	}
	
	public static String obterNomeSeguradora(Optional<Pessoa> optionalPessoa) {
		return optionalPessoa.flatMap(Pessoa::getCarro).flatMap(Carro::getSeguradora).map(Seguradora::getNome).orElse(null);
	}
}
