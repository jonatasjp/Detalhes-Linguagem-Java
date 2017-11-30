package PackageDentro;

public class Pessoa extends SerHumano {

	protected String nome;
	protected String sobrenome;
	
	public Pessoa(String nome, String sobrenome) {
		super(null, null);
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.getNome();
		this.getAsdf();
//		Pessoa p = (Pessoa) this.clone();
		Object o = this;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String nomeCompleto(){
		return this.nome +" " +this.sobrenome;
	}

	@Override
	public String getAsdf() {
		// TODO Auto-generated method stub
		return super.getAsdf();
	}
	 
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Pessoa pe = new Pessoa(null, null);
		pe.nome = this.nome;
		pe.sobrenome = this.sobrenome;
		return pe;
	}
}
