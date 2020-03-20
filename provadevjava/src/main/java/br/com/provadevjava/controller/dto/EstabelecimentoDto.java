package br.com.provadevjava.controller.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import br.com.provadevjava.model.Estabelecimento;

public class EstabelecimentoDto {

	private Long id;
	private String cnpj;
	private String nomeRazaoSocial;
	private String endereco;
	private String telefone;
	private String qntdVagasMoto;
	private String qntdVagasCarro;
	private LocalDateTime dataCriacao;
	
	public EstabelecimentoDto(Estabelecimento estabelecimento) {
		this.id = estabelecimento.getId();
		this.cnpj = estabelecimento.getCnpj();
		this.nomeRazaoSocial = estabelecimento.getNomeRazaoSocial();
		this.endereco = estabelecimento.getEndereco();
		this.telefone = estabelecimento.getTelefone();
		this.qntdVagasMoto = estabelecimento.getQntdVagasMoto();
		this.qntdVagasCarro = estabelecimento.getQntdVagasCarro();
		this.dataCriacao = estabelecimento.getDataCriacao();
		
	}
	
	public Long getId() {
		return id;
	}
	public String getCnpj() {
		return cnpj;
	}
	public String getNomeRazaoSocial() {
		return nomeRazaoSocial;
	}
	public String getEndereco() {
		return endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public String getQntdVagasMoto() {
		return qntdVagasMoto;
	}
	public String getQntdVagasCarro() {
		return qntdVagasCarro;
	}
	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public static List<EstabelecimentoDto> converter(List<Estabelecimento> estabelecimentos) {
		return estabelecimentos.stream().map(EstabelecimentoDto::new).collect(Collectors.toList());
	}


	
}
