package Strings;

public class UsandoArrayChar {
	
	public static void main(String[] args) {
		
		//Atribuindo caracteres de uma string a um array de caracteres
		char[] arrayChar = new char[7];
		/*
		 *O primeiro parametro representa a posi��o inicial do primeiro caractere a ser obtido na string
		 *O segundo parametro representa o indice + 1 do ultimo caractere a ser obtido na string
		 *o terceiro parametro � o array de caracteres que ser� populado
		 *o quarto parametro � o indice que receber� o primeiro caractere dentro do array passado no terceiro parametro
		 **/
		"jonatas".getChars(0, 7, arrayChar, 0);
		
		for (int i = 0; i < arrayChar.length; i++) {
			System.out.print(arrayChar[i]);
		}

		
	}
}
