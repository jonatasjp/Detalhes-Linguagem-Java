package Strings;

public class UsandoCharAt {

	public static void main(String[] args) {
		
		String nome = "André";
		
		//imprimindo os caracteres da string em ordem natural
		for (int i = 0; i < nome.length(); i++) {
			System.out.print(nome.charAt(i));
		}
		
		System.out.println("\n----------------------------");
		
		//imprimindo os caracteres da string em ordem reversa
		for (int i = nome.length()-1; i >= 0; i--) {
			System.out.print(nome.charAt(i));
		}
		
	}
}
