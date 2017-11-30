package polimorfismo;

public class PessoaFisica implements Pessoa {

	private String logradouro;
	
	public PessoaFisica(String nome, String sobrenome, String cpf, String logradouro) {
//		super(nome, sobrenome, cpf);
		this.logradouro = logradouro;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	public String informacoesPersonalizadas(){
		return "Pessoa fisica: " + " logradouro: "+logradouro;
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
