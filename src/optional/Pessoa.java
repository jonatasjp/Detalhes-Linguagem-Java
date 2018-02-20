package optional;

import java.util.Optional;

public class Pessoa {

	private String nome;
	private Carro carro;

	public Optional<String> getNome() {
		return Optional.ofNullable(nome);
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Optional<Carro> getCarro() {
		return Optional.ofNullable(carro);
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

}
