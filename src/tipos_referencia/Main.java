package tipos_referencia;

public class Main {
	
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("jonatas");
		
		passarPessoaReferencia1(pessoa);
		System.out.println(pessoa);
		
		passarPessoaReferencia2(pessoa);
		System.out.println(pessoa);
		
		int[] intArray = {1,2,3};
		
		System.out.println(0.0 / 0.0);
		
		modificarValorArrayPassandoArray(intArray);
		modificarValorArrayPassandoValorDoArray(intArray[1]);
		
		String nome = "Jonatas";
		System.out.println(nome);
		modificarValorStringPassandoString(nome);
		System.out.println(nome);
		
		String a = "jonatas";
		String b = "jonatas";
		//true
		System.out.println(a == b);
		String c = new String("jonatas");
		//false
		System.out.println(b == c);
	}

	private static void modificarValorStringPassandoString(String nome) {
		nome = "andré";
	}

	private static void modificarValorArrayPassandoValorDoArray(int i) {
		i = 55;
	}

	private static void modificarValorArrayPassandoArray(int[] intArray) {
		intArray[1] = 77;
	}

	private static void passarPessoaReferencia1(Pessoa pessoa) {
		pessoa = new Pessoa("testando");
	}

	private static void passarPessoaReferencia2(Pessoa pessoa) {
		pessoa.setNome("andré");
	}

}
