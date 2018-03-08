package streams;

import java.util.Arrays;
import java.util.List;

public class Pessoa implements Comparable<Pessoa>{

	private String nome;
	private Integer idade;
	private Double salario;

	public Pessoa(String nome, Integer idade, Double salario) {
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	}

	public static List<Pessoa> bancoDePessoas() {
		return Arrays.asList(
				new Pessoa("jonatas", 24, 2200d), 
				new Pessoa("andré", 18, 5000d),
				new Pessoa("joão", 50, 2000d), 
				new Pessoa("caio", 32, 5500d), 
				new Pessoa("fabio", 29, 3200d),
				new Pessoa("fabio", 29, 3200d),
				new Pessoa("bruce wayne", 35, 50000d), 
				new Pessoa("bary allen", 28, 3000d),
				new Pessoa("oliver queen", 33, 4500d));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", salario=" + salario + "]";
	}

	@Override
	public int compareTo(Pessoa o) {
		return this.getNome().compareTo(o.getNome());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

}
