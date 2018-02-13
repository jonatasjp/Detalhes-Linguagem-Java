package inner_class;

public class ClasseInternaTest {

	private String nome;
	
	public ClasseInternaTest(String nome) {
		this.nome = nome;
	}

	class Interna {
		public void teste() {
			System.out.println(nome);
			System.out.println(ClasseInternaTest.this.nome);
			
			System.out.println("---------------------");
			
			System.out.println(this);
			System.out.println(ClasseInternaTest.this);
		}
	}
	
	public static void main(String[] args) {
		
		Interna i = new ClasseInternaTest("jonatas").new Interna();
		i.teste();
	}
}
