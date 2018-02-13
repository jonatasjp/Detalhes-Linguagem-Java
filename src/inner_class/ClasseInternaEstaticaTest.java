package inner_class;

class Externa {

	static class Interna {
		public void imprimir() {
			System.out.println("oi");
		}
	}

}

public class ClasseInternaEstaticaTest {

	public static void main(String[] args) {
		Externa.Interna i = new Externa.Interna();
		i.imprimir();

		Interna2 i2 = new Interna2();
		i2.imprimir();
	}

	static class Interna2 {
		public void imprimir() {
			System.out.println("oi");
		}
	}

}
