package com.sankhya.produto.resources;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sankhya.produto.entity.Produto;
import com.sankhya.produto.repositories.ProdutoRepository;

@RestController
@RequestMapping("/produtos")
public class ProdutoResource {

	private static Logger logger = LoggerFactory.getLogger(ProdutoResource.class);
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Value("${test.config}")
	private String testConfig;
	
	@GetMapping
	public ResponseEntity<List<Produto>> findAll() {
		List<Produto> list = produtoRepository.findAll();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping("/configs")
	public ResponseEntity<Void> getConfigs() {
		logger.info("Config = " +testConfig);
		return ResponseEntity.noContent().build();
	}
	
}
