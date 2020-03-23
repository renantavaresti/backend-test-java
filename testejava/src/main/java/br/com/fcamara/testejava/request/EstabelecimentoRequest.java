package br.com.fcamara.testejava.request;

import java.util.List;

public class EstabelecimentoRequest {

	private String nome;
	private String cnpj;
	private EnderecoRequest endereco;
	private String telefone;
	private List<QuantidadeVaga> qtVagas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public EnderecoRequest getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoRequest endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public List<QuantidadeVaga> getQtVagas() {
		return qtVagas;
	}

	public void setQtVagas(List<QuantidadeVaga> qtVagas) {
		this.qtVagas = qtVagas;
	}
}
