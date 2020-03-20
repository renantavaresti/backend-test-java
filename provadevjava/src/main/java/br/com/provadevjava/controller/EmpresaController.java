package br.com.provadevjava.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.provadevjava.controller.dto.EstabelecimentoDto;
import br.com.provadevjava.model.Estabelecimento;

@RestController
public class EmpresaController {

	@RequestMapping("/Empresa")
	public List<EstabelecimentoDto> lista(){
		Estabelecimento estabelecimento = new Estabelecimento("54.555.555/0001-05", "Casinha SA", "Rua Visconde de Cayru", 
				"(13) 98190-7515", "2", "2");
		return EstabelecimentoDto.converter(Arrays.asList(estabelecimento, estabelecimento, estabelecimento));
	}
}
