package br.com.fcamara.testejava.controller.form;

import br.com.fcamara.testejava.model.Estabelecimento;

public class EstabelecimentoForm {

	private String nome;
	private String cnpj;
	private String endereco;
	private String telefone;
	private String vagas;
	
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
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getVagas() {
		return vagas;
	}
	public void setVagas(String vagas) {
		this.vagas = vagas;
	}
	public Estabelecimento converter() {
		return new Estabelecimento(nome, cnpj, endereco, telefone, vagas);
	}
	
}
