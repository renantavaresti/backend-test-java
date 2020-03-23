package br.com.fcamara.testejava.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fcamara.testejava.model.Estabelecimento;

public interface EstabelecimentoRepository extends JpaRepository<Estabelecimento, Long> {

}