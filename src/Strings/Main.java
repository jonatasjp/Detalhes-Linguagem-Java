package Strings;

public class Main {
	
	public static void main(String[] args) {
		
		String nome = "jonatas";
		
		//imprimindo os caracteres da string em ordem natural
		for (int i = 0; i < nome.length(); i++) {
			System.out.print(nome.charAt(i));
		}
		
		System.out.println("\n----------------------------");
		
		//imprimindo os caracteres da string em ordem reversa
		for (int i = nome.length()-1; i >= 0; i--) {
			System.out.print(nome.charAt(i));
		}
		
		System.out.println("\n----------------------------");
		
		//Atribuindo caracteres de uma string a um array de caracteres
		char[] arrayChar = new char[7];
		/*
		 *O primeiro parametro representa a posição inicial do primeiro caractere a ser obtido na string
		 *O segundo parametro representa o indice + 1 do ultimo caractere a ser obtido na string
		 *o terceiro parametro é o array de caracteres que será populado
		 *o quarto parametro é o indice que receberá o primeiro caractere dentro do array passado no terceiro parametro
		 **/
		nome.getChars(0, 7, arrayChar, 0);
		
		for (int i = 0; i < arrayChar.length; i++) {
			System.out.print(arrayChar[i]);
		}
		
		String a = new String("abc");
		String b = new String("abc");
		System.out.println(a == b);
		
		String s3 = "happy Birthday";
		String s4 = "Happy birthday";
		/* 1- indice inicial da string que chama
		 * 2- string a ser comparada
		 * 3- indice inicial da string do parametro
		 * 4- numero de caracteres a comparar
		 * No segundo caso o parametro booleana passado como true indica que um ignoreCase*/
		System.out.println(s3.regionMatches(0, s4, 0, 5));
		System.out.println(s3.regionMatches(true, 0, s4, 0, 5));
		
		nome = "jonatas luis lima nobre";
		
		int index = nome.indexOf('l');
		System.out.println(index);
		
		index = nome.indexOf("lima");
		System.out.println(index);
		
		System.out.println(nome.substring(nome.indexOf('j')));
		System.out.println(nome.substring(nome.indexOf("luis"), nome.indexOf("nobre")));
		
		System.out.println(nome.replace(nome.substring(nome.indexOf("luis"), nome.indexOf("nobre")), "FLAMENGUISTA "));
		
	}
}
