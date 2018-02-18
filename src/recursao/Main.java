package recursao;

public class Main {
	
	public static void main(String[] args) {
		
		String nome = "são exatamente quatro horas da tarde";
		char letra = 'a';
		
		System.out.println(contarLetrasEncontradas(nome, letra));
		
	}
	
	public static int contarLetrasEncontradas(String nome, char letra){
		
		if(nome != null && nome.length() == 0)
			return 0;
		
		char letraDoNome = nome.toCharArray()[0];
		
		int quantidade = letraDoNome == letra ? 1 : 0;
		
		return quantidade + contarLetrasEncontradas(substringAPartirDoIndiceUm(nome), letra);
	}

	public static String substringAPartirDoIndiceUm(String nome) {
		if(nome != null && !nome.isEmpty())
			return nome.substring(1);
		
		return null;
	}
}
