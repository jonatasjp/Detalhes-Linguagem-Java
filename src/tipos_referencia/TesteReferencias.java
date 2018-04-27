package tipos_referencia;

public class TesteReferencias {

	public static void main(String[] args) {

		Carro c = new Carro();
		Carros carros = new Carros();
		
		c.nome = "gol";
		carros.c1 = c;
		System.out.println(c);
		System.out.println(carros.c1);

		System.out.println("------------------------");
		
		carros.c1.nome = "celta";
		System.out.println(carros.c1);
		System.out.println(c);
		
		System.out.println("------------------------");
		
		Carro b = new Carro();
		b.nome = "astra";
		
		c = b;
		System.out.println(carros.c1);
		System.out.println(c);
		
	}

}

class Carro {
	String nome;
	
	@Override
	public String toString() {
		return nome;
	}
}

class Carros {
	Carro c1;
}
