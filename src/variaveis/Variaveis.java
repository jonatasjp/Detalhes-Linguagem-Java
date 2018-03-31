package variaveis;

public class Variaveis {

	static int x = 15;

	public static void main(String[] args) {

		teste01();

		// -------------------------------------------------------------------------------

		teste02();

		// --------------------------------------------------------------------------------

		teste03();
	}

	public static void teste03() {
		x = 200;
		System.out.println(x);
	}

	public static void teste02() {
		for (int i = 0; i < 20; i++) {
			System.out.println(i);
		}
		int i = 15;
		System.out.println(i);
	}

	public static void teste01() {
		for (int i = 0; i < 20; i++)
			System.out.println(i);
		// System.out.println(i); COMPILATION ERROR
	}
}
