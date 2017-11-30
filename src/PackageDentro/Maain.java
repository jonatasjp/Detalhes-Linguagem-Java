package PackageDentro;

public class Maain {

	public static void main(String[] args) {

		Pessoa p = new Pessoa(null, null);
		// atributos 'protected' só estão acessíveis por subclasses ou quando
		// está
		// no mesmo pacote.
		p.nome = "NOME";

	}

}
