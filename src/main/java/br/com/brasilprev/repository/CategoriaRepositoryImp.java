package br.com.brasilprev.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import br.com.brasilprev.beans.Categoria;

@Repository
public class CategoriaRepositoryImp implements CategoriaRepository{
	
	Logger logger = LoggerFactory.getLogger(CategoriaRepositoryImp.class);

	@Override
	public Categoria populaCategoria() {
		logger.info("Populando categoria.");
		
		Categoria categoria = new Categoria();
		
		categoria.setIdCategoria(1);
		categoria.setCategoria("Esporte");
		
		return categoria;
	}

}
