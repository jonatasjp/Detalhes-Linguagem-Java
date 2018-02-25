package excessoes;

public class Main {
	
	public static void main(String[] args) {
		a();
	}

	private static void a() {
		System.out.println("A EXECUTADO");
		b();
	}

	private static void b() {
		System.out.println("B EXECUTADO");
		c();
	}

	private static void c() {
		System.out.println("C EXECUTADO");
		d();
	}

	private static void d() {
		try {
			throw new Exception("ocorreu um erro");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
