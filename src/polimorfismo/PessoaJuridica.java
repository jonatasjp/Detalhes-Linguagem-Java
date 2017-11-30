package polimorfismo;

public class PessoaJuridica implements Pessoa {

	private String cnpj;
	
	public PessoaJuridica(String nome, String sobrenome, String cpf, String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String informacoesPersonalizadas(){
		return "Pessoa juridica: " + " cnpj: "+cnpj;
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setNome(String nome) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getSobrenome() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSobrenome(String sobrenome) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getCpf() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCpf(String cpf) {
		// TODO Auto-generated method stub
		
	}
	
}
