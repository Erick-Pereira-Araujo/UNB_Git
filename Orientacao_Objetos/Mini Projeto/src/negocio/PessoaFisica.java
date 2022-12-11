package negocio;

import java.util.Date;

public class PessoaFisica extends Pessoa{

	private int idPessoaFisica;
	private Date dataNascimento;
	private String cpf;
	
	public PessoaFisica(int idPessoaFisica, String nome, String telefone, String email, String endereco, Date dataNascimento, String cpf) {
		super(nome, telefone, email, endereco);
		this.idPessoaFisica = idPessoaFisica;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
	}
	

	public int getIdPessoaFisica() {
		return idPessoaFisica;
	}

	public void setIdPessoaFisica(int idPessoaFisica) {
		this.idPessoaFisica = idPessoaFisica;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String toString() {	
		return "Pesso Fisica\nID: " + idPessoaFisica + "\nNome: " + nome + "\nTelefone: " + telefone + "\nE-mail: " + 
				email + "\nEndereco: " + endereco + "\nData Nascimento: " + dataNascimento + "\nCPF: " + cpf;
	}

}
