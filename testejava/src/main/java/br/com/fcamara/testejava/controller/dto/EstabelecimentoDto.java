package br.com.fcamara.testejava.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

//import java.util.List;
//import java.util.stream.Collectors;

import br.com.fcamara.testejava.model.Estabelecimento;

public class EstabelecimentoDto {
	
	private Long id;
	private String nome;
	private String cnpj;
	private String endereco;
	private String telefone;
	
	public EstabelecimentoDto(Estabelecimento estabelecimento) {
		this.id = estabelecimento.getId();
		this.nome = estabelecimento.getNome();
		this.cnpj = estabelecimento.getCnpj();
		this.endereco = estabelecimento.getEndereco();
		this.telefone = estabelecimento.getTelefone();
	}
	
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public String getEndereco() {
		return endereco;
	}
	public String getTelefone() {
		return telefone;
	}

	public static List<EstabelecimentoDto> converter(List<Estabelecimento> estabelecimentos) {
		return estabelecimentos.stream().map(EstabelecimentoDto::new).collect(Collectors.toList());
	}
}