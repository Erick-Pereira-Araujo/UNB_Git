package negocio;

public class PessoaJuridica extends Pessoa{

	private int idPessoaJuridica;
	private String cnpj;
	private PessoaFisica responsavel;
	
	
	public PessoaJuridica(int idPessoaJuridica, String nome, String telefone, String email, String endereco, String cnpj,
			PessoaFisica responsavel) {
		super(nome, telefone, email, endereco);
		this.idPessoaJuridica = idPessoaJuridica;
		this.cnpj = cnpj;
		this.responsavel = responsavel;
	}
	
	

	public int getIdPessoaJuridica() {
		return idPessoaJuridica;
	}

	public void setIdPessoaJuridica(int idPessoaJuridica) {
		this.idPessoaJuridica = idPessoaJuridica;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public PessoaFisica getresponsavel() {
		return responsavel;
	}

	public void setresponsavel(PessoaFisica responsavel) {
		this.responsavel = responsavel;
	}
	
	public String toString() {	
		return "Pesso Juridica\nID: " + idPessoaJuridica + "\nNome: " + nome + "\nTelefone: " + telefone + "\nE-mail: " + 
				email + "\nEndereco: " + endereco + "\nCNPJ: " + cnpj + "\nNome do Responsavel: " + responsavel.nome;
	}
	
}
