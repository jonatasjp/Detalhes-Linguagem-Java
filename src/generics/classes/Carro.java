package generics.classes;

public class Carro extends MeioDeTransporte{

	private String nome;

	public Carro(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Carro [nome=" + nome + "]";
	}

}
