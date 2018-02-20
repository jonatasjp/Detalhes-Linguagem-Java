package optional.optional2;

import java.util.Optional;

public class OptionalTeste {

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

	public static String obterNomeSeguradora(Optional<Pessoa> opPessoa) {
		return opPessoa.map(Pessoa::getCarro).map(Carro::getSeguradora).map(Seguradora::getNome).orElse("NÃO EXISTE SEGURADORA");
	}

}
