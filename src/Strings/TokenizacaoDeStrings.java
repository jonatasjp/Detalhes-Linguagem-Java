package Strings;

public class TokenizacaoDeStrings {

	public static void main(String[] args) {

		String linha = "Jonatas;luis lima nobre;24";

		String[] tokens = linha.split(";");
		String nome = tokens[0];
		String sobrenome = tokens[1];
		String idade = tokens[2];
		Pessoa pessoa = new TokenizacaoDeStrings().new Pessoa(nome, sobrenome, idade);
		
		System.out.println(pessoa);
	}

	public class Pessoa {

		private String nome;
		private String sobrenome;
		private String idade;

		Pessoa(String nome, String sobrenome, String idade) {
			this.nome = nome;
			this.sobrenome = sobrenome;
			this.idade = idade;
		}

		@Override
		public String toString() {
			return "Pessoa [nome=" + nome + ", sobrenome=" + sobrenome + ", idade=" + idade + "]";
		}
	}
}
