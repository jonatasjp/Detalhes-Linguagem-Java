package optional;

import java.util.Optional;

public class Carro {

	private String nome;
	private Seguradora seguradora;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Optional<Seguradora> getSeguradora() {
		return Optional.ofNullable(seguradora) ;
	}

	public void setSeguradora(Seguradora seguradora) {
		this.seguradora = seguradora;
	}

}
