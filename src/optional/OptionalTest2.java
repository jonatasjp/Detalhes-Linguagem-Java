package optional;

import java.util.Optional;

public class OptionalTest2 {

	public static void main(String[] args) {
		
		System.out.println(obterNomePessoaComOptional(new Pessoa()));
		System.out.println(obterNomePessoaComOptionalEFlatMap(null));
		
	}
	
	public static Optional<Optional<String>> obterNomePessoaComOptional(Pessoa pessoa) {
		Optional<Pessoa> opPessoa = Optional.ofNullable(pessoa);
		return opPessoa.map(Pessoa::getNome);
	}
	
	public static String obterNomePessoaComOptionalEFlatMap(Pessoa pessoa) {
		Optional<Pessoa> opPessoa = Optional.ofNullable(pessoa);
		return opPessoa.flatMap(Pessoa::getNome).orElse("NOME VAZIO");
	}

}
