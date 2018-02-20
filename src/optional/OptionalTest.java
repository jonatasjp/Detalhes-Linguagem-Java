package optional;

import java.util.Optional;

public class OptionalTest {
	
	public static void main(String[] args) {
		
		String nome = null;
		
		//Criando um optional vazio
		Optional<String> optional = Optional.empty();
		
		//Dessa forma pode criar um optional sem ter certeza se o valor � nulo ou n�o
		Optional<String> optional2 = Optional.ofNullable(nome);
		
		//S� utilizar caso tiver certeza que o valor n�o ser� null, caso contr�rio uma excess�o � lan�ada.
		Optional<String> optional3 = Optional.of("jonatas");
		
		System.out.println(optional);
		System.out.println(optional2);
		System.out.println(optional3);
		
		// ------------------------------------------------------------------------------------ //
		
		//recuperando valores
		
		// se no m�todo get n�o houver valor (null) ent�o uma excess�o ser� lan�ada. (necess�rio realizar verifica��o em caso de incerteza)
		if(optional.isPresent())
			System.out.println(optional.get());
		
		//executando dessa forma mesmo que o objeto retornado seja nulo nunca ser� lan�ada uma excess�o
		//pois o que ser� retornado ser� o especificado no orElse
		System.out.println(optional2.orElse("VAZIO"));
		System.out.println(optional3.orElse("VAZIO"));
		
	}
}
