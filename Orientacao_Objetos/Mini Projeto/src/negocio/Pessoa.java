package negocio;

import java.util.ArrayList;

public abstract class Pessoa {
	
	protected String nome;
	protected String telefone;
	protected String email;
	protected String endereco;
	private ArrayList<Integer> idsOrcamentos;
	
	public Pessoa(String nome, String telefone, String email, String endereco) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public ArrayList<Integer> getIdsOrcamentos() {
		return idsOrcamentos;
	}

	public void setIdsOrcamentos(ArrayList<Integer> idsOrcamentos) {
		this.idsOrcamentos = idsOrcamentos;
	}
	
}
