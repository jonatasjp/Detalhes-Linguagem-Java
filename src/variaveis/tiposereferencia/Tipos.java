package variaveis.tiposereferencia;

public class Tipos {

	public static void main(String[] args) {

		Objeto a = new Objeto();
		a.valor = 10;

		Objeto b = a;
		b.valor = 15;

		System.out.println(a == b);

		teste(a);
		System.out.println(a.valor);
	}

	public static void teste(Objeto o) {
		o.valor = 20;
		o = null;
	}
}

class Objeto {
	int valor;
}
