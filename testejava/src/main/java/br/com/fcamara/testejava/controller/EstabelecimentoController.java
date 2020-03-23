package br.com.fcamara.testejava.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.fcamara.testejava.controller.dto.EstabelecimentoDto;
import br.com.fcamara.testejava.controller.form.EstabelecimentoForm;
import br.com.fcamara.testejava.model.Estabelecimento;
import br.com.fcamara.testejava.repository.EstabelecimentoRepository;

@RestController
@RequestMapping("/estabelecimento")
public class EstabelecimentoController {
	
	@Autowired
	private EstabelecimentoRepository estabelecimentoRepository;
	
	@GetMapping
	public List<EstabelecimentoDto> lista(){
		List<Estabelecimento> estabelecimentos = estabelecimentoRepository.findAll();
		return EstabelecimentoDto.converter(estabelecimentos);
	}

	@PostMapping
	public ResponseEntity<EstabelecimentoDto> cadastrar(@RequestBody EstabelecimentoForm form, UriComponentsBuilder uriBuilder) {
		Estabelecimento estabelecimento = form.converter();
		estabelecimentoRepository.save(estabelecimento);
		
		URI uri = uriBuilder.path("/estabelecimento/{id}").buildAndExpand(estabelecimento.getId()).toUri();
		return ResponseEntity.created(uri).body(new EstabelecimentoDto(estabelecimento));
	}
	
}