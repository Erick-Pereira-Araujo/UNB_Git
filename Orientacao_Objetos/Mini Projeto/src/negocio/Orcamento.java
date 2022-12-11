package negocio;

import java.util.Date;

public class Orcamento {

	private int idOrcamento;
	private String titulo;
	private String descricao;
	private Date dataCriacao;
	private Date dataValidade;
	//tipo = 1 pessoaFisica | tipo2 = pessoaJuridica
	private int tipoPessoa;
	private int idPessoa;
	private Double valorInvestimento;
	
	public Orcamento(int idOrcamento, String titulo, String descricao, Date dataCriacao, Date dataValidade,
			int tipoPessoa, int idPessoa, Double valorInvestimento) {
		this.idOrcamento = idOrcamento;
		this.titulo = titulo;
		this.descricao = descricao;
		this.dataCriacao = dataCriacao;
		this.dataValidade = dataValidade;
		this.tipoPessoa = tipoPessoa;
		this.idPessoa = idPessoa;
		this.valorInvestimento = valorInvestimento;
	}
	
	public String toString() {	
		return "Orcamento\nID: " + idOrcamento + "\nTitulo: " + titulo + "\nDescricao: " + descricao + "\nData de Criacao: " + 
				dataCriacao + "\nDataValidade: " + dataValidade + "\nTipo de Pessoa: " + tipoPessoa + "\nId da Pessoa: " + idPessoa + 
				"\nInvestimento: R$" + valorInvestimento;
	}

	public int getIdOrcamento() {
		return idOrcamento;
	}

	public void setIdOrcamento(int idOrcamento) {
		this.idOrcamento = idOrcamento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Date getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}

	public int getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(int tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public int getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

	public Double getValorInvestimento() {
		return valorInvestimento;
	}

	public void setValorInvestimento(Double valorInvestimento) {
		this.valorInvestimento = valorInvestimento;
	}
}
