package PackageDentro;

public class Maain {

	public static void main(String[] args) {

		Pessoa p = new Pessoa(null, null);
		// atributos 'protected' s� est�o acess�veis por subclasses ou quando
		// est�
		// no mesmo pacote.
		p.nome = "NOME";

	}

}
