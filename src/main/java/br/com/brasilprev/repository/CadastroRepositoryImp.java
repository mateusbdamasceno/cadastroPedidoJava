package br.com.brasilprev.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import br.com.brasilprev.beans.PedidoItem;

@Repository
public class CadastroRepositoryImp implements CadastroRepository {
	Logger logger = LoggerFactory.getLogger(CadastroRepositoryImp.class);

	@Override
	public void registraProdutos(PedidoItem pedido) {
		logger.info("Cadastrando produto passand pelo CadastroRepositoryImp.");
		
	}

}
