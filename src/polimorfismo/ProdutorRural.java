package polimorfismo;

public class ProdutorRural implements Pessoa{

	private String cpr;
	
	public ProdutorRural(String nome, String sobrenome, String cpf, String cpr) {
//		super(nome, sobrenome, cpf);
		this.cpr = cpr;
	}

	public String getCpr() {
		return cpr;
	}

	public void setCpr(String cpr) {
		this.cpr = cpr;
	}

	public String informacoesPersonalizadas(){
		return "Produtor rural: " + " cpr: "+cpr;
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
