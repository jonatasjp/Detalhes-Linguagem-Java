package lambdas;

import java.util.function.Predicate;

public class LambdaTeste {

	public static void main(String[] args) {
		
		testar((a, b) -> System.out.println(a +" " +b));
		testar2( nome -> nome.equalsIgnoreCase("jonatas"));
		
		testeRunnable();
		testeRunnable2();
		
		testeRunnableEmThread();
	
	}

	public static void testeRunnableEmThread() {
		new Thread(() -> System.out.println("executando lambda em uma thread")).start();
	}

	public static void testeRunnable() {
		Runnable runable = () -> System.out.println("testando runnable");
		runable.run();
	}

	public static void testeRunnable2() {
		Runnable runable = () -> {
			System.out.println("testando runnable 2ª vez");
		};
		runable.run();
	}
	
	public static void testar(InterfaceTeste i) {
		i.teste("Jonatas", "Luis");
	}
	
	public static void testar2(Predicate<String> predicate) {
		System.out.println(predicate.test("Jonatas"));
	}
	
}
