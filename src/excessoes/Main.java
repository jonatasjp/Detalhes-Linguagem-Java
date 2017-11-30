package excessoes;

import java.io.IOException;

public class Main {
	
	public static void main(String[] args) {
		try {
			a();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void a() throws Exception {
		System.out.println("A EXECUTADO");
		b();
	}

	private static void b() throws Exception {
		System.out.println("B EXECUTADO");
		c();
	}

	private static void c() throws Exception {
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
