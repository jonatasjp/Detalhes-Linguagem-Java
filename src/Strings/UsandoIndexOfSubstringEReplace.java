package Strings;

public class UsandoIndexOfSubstringEReplace {
	
	public static void main(String[] args) {
		
		String nome = "jonatas luis lima nobre";
		
		int index = nome.indexOf('l');
		System.out.println(index);
		
		index = nome.indexOf("lima");
		System.out.println(index);
		
		System.out.println(nome.substring(nome.indexOf('j')));
		System.out.println(nome.substring(nome.indexOf("luis"), nome.indexOf("nobre")));
		
		System.out.println(nome.replace(nome.substring(nome.indexOf("luis"), nome.indexOf("nobre")), "FLAMENGUISTA "));
		
	}

}
