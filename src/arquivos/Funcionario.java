package arquivos;

public class Funcionario {

	private String nome;
	private String funcao;
	private String salario;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
	return "Funcionario: "+this.nome+", Fun��o: "+this.funcao+", Sal�rio: "+this.salario;
	}

	
}