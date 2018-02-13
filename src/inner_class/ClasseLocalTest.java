package inner_class;

public class ClasseLocalTest {

	private String nome = "jonatas";

	public void fazAlgumaCoisa() {
		class Interna {
			public void imprimeNome() {
				System.out.println(nome);
			}
		}
		Interna i = new Interna();
		i.imprimeNome();
	}
	
	public static void main(String[] args) {
		
		ClasseLocalTest local = new ClasseLocalTest();
		local.fazAlgumaCoisa();
		
	}
	
	

}
