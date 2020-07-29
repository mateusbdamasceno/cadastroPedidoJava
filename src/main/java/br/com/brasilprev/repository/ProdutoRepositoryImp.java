package br.com.brasilprev.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.brasilprev.beans.Produto;

@Repository
public class ProdutoRepositoryImp implements ProdutoRepository{
	
	Logger logger = LoggerFactory.getLogger(ProdutoRepositoryImp.class);
	
	@Autowired
	CategoriaRepository categoriaRepository;

	@Override
	public Produto populaProduto() {
		logger.info("Populando produto.");
		
		Produto produto = new Produto();
		
		produto.setIdProduto(1);
		produto.setCategoria(categoriaRepository.populaCategoria());
		produto.setPreco(5.0);
		produto.setQuantidade(5);
		produto.setDescricao("Tênis");
		
		return produto;
	}

}
