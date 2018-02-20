package optional;

import java.util.Optional;

public class OptionalTest {
	
	public static void main(String[] args) {
		
		String nome = null;
		
		//Criando um optional vazio
		Optional<String> optional = Optional.empty();
		
		//Dessa forma pode criar um optional sem ter certeza se o valor é nulo ou não
		Optional<String> optional2 = Optional.ofNullable(nome);
		
		//Só utilizar caso tiver certeza que o valor não será null, caso contrário uma excessão é lançada.
		Optional<String> optional3 = Optional.of("jonatas");
		
		System.out.println(optional);
		System.out.println(optional2);
		System.out.println(optional3);
		
		// ------------------------------------------------------------------------------------ //
		
		//recuperando valores
		
		// se no método get não houver valor (null) então uma excessão será lançada. (necessário realizar verificação em caso de incerteza)
		if(optional.isPresent())
			System.out.println(optional.get());
		
		//executando dessa forma mesmo que o objeto retornado seja nulo nunca será lançada uma excessão
		//pois o que será retornado será o especificado no orElse
		System.out.println(optional2.orElse("VAZIO"));
		System.out.println(optional3.orElse("VAZIO"));
		
	}
}
