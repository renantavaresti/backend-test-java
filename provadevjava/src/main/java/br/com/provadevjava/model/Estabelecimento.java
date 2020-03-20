package br.com.provadevjava.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Estabelecimento {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String cnpj;
	private String nomeRazaoSocial;
	private String endereco;
	private String telefone;
	private String qntdVagasMoto;
	private String qntdVagasCarro;
	private LocalDateTime dataCriacao = LocalDateTime.now();
	
	public Estabelecimento(String cnpj, String nomeRazaoSocial, String endereco, String telefone, String qntdVagasMotos, String qntdVagasCarro) {
		this.cnpj = cnpj;
		this.nomeRazaoSocial = nomeRazaoSocial;
		this.endereco = endereco;
		this.telefone = telefone;
		this.qntdVagasMoto = qntdVagasMotos;
		this.qntdVagasCarro = qntdVagasCarro;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNomeRazaoSocial() {
		return nomeRazaoSocial;
	}

	public void setNomeRazaoSocial(String nomeRazaoSocial) {
		this.nomeRazaoSocial = nomeRazaoSocial;
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

	public String getQntdVagasMoto() {
		return qntdVagasMoto;
	}

	public void setQntdVagasMoto(String qntdVagasMoto) {
		this.qntdVagasMoto = qntdVagasMoto;
	}

	public String getQntdVagasCarro() {
		return qntdVagasCarro;
	}

	public void setQntdVagasCarro(String qntdVagasCarro) {
		this.qntdVagasCarro = qntdVagasCarro;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	
}
