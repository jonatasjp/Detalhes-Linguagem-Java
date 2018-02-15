package generics.classes;

public class Carro extends MeioDeTransporte {

	private String nome;
	private String cor;

	public Carro(String nome) {
		this.nome = nome;
	}

	public Carro(String nome, String cor) {
		this.nome = nome;
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "Carro [nome=" + nome + ", cor=" + cor + "]";
	}

}
