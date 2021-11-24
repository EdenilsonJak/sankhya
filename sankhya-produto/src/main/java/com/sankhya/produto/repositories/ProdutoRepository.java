package com.sankhya.produto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sankhya.produto.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
