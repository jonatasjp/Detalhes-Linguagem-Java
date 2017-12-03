package Strings;

public class UsandoCharacter {
	
	public static void main(String[] args) {
		
		char c = 'J';
		
		//verifica se é um digito
		System.out.println(Character.isDigit(c));
		//verifica se está definido no conjunto de caracteres unicode
		System.out.println(Character.isDefined(c));
		//verifica se é letra ou número
		System.out.println(Character.isLetterOrDigit(c));
		//verifica se é letra
		System.out.println(Character.isLetter(c));
		//verifica se é maiscula
		System.out.println(Character.isUpperCase(c));
		//verifica se é minuscula
		System.out.println(Character.isLowerCase(c));
		//passa a letra para maiuscula
		System.out.println(Character.toUpperCase(c));
		//passa a letra para minuscula
		System.out.println(Character.toLowerCase(c));
	}
}
