package Strings;

public class UsandoCharacter {
	
	public static void main(String[] args) {
		
		char c = 'J';
		
		//verifica se � um digito
		System.out.println(Character.isDigit(c));
		//verifica se est� definido no conjunto de caracteres unicode
		System.out.println(Character.isDefined(c));
		//verifica se � letra ou n�mero
		System.out.println(Character.isLetterOrDigit(c));
		//verifica se � letra
		System.out.println(Character.isLetter(c));
		//verifica se � maiscula
		System.out.println(Character.isUpperCase(c));
		//verifica se � minuscula
		System.out.println(Character.isLowerCase(c));
		//passa a letra para maiuscula
		System.out.println(Character.toUpperCase(c));
		//passa a letra para minuscula
		System.out.println(Character.toLowerCase(c));
	}
}
