package Strings;

public class ComparandoStrings {
	
	public static void main(String[] args) {
		
		String a = new String("abc");
		String b = new String("abc");
		System.out.println(a == b); //FALSE
		System.out.println(a.equals(b)); //TRUE
		
		String s3 = "happy Birthday";
		String s4 = "Happy birthday";
		/* 1- indice inicial da string que chama
		 * 2- string a ser comparada
		 * 3- indice inicial da string do parametro
		 * 4- numero de caracteres a comparar
		 * No segundo caso o parametro booleana passado como true indica que um ignoreCase*/
		System.out.println(s3.regionMatches(0, s4, 0, 5)); // FALSE
		System.out.println(s3.regionMatches(true, 0, s4, 0, 5)); // TRUE

		
	}
}
