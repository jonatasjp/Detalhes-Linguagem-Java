package optional.optional2;

import java.util.Optional;

public class OptionalTeste {

	public static void main(String[] args) {

		Pessoa p = new Pessoa();

		System.out.println(obterNomeSeguradora(p));

		Carro c = new Carro();
		p.setCarro(c);
		Seguradora s = new Seguradora();
		c.setSeguradora(s);
		s.setNome("seguradora abc");

		System.out.println(obterNomeSeguradora(p));
	}

	public static String obterNomeSeguradora(Pessoa pessoa) {
		Optional<Carro> opCarro = Optional.ofNullable(pessoa.getCarro());
		Optional<Seguradora> opSeguradora = Optional.ofNullable(opCarro.orElse(new Carro()).getSeguradora());
		
		return opSeguradora.orElse(new Seguradora()).getNome();
	}

}
