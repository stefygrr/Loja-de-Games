package com.generation.lojinhagames.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.lojinhagames.model.Produtos;

public interface ProdutosRepository extends JpaRepository<Produtos, Long> {

	List<Produtos> findAllByNomeContainingIgnoreCase(@Param("nome")String nome);
	
	public List <Produtos> findAllByPrecoGreaterThanOrderByPreco(BigDecimal preco);

	public List <Produtos> findAllByPrecoLessThanOrderByPrecoDesc(BigDecimal preco);
}
