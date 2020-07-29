package br.com.brasilprev.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.brasilprev.beans.PedidoItem;
import br.com.brasilprev.repository.CadastroRepository;
import br.com.brasilprev.repository.PedidoItemRepository;

@Service
public class CadastroServiceImp implements CadastroService{
	
	Logger logger = LoggerFactory.getLogger(CadastroServiceImp.class);
	
	@Autowired
	CadastroRepository cadastroRepository;
	
	@Autowired
	PedidoItemRepository pedidoItemRepository;
	
	
	public void cadastraPedido() throws Exception{
		logger.info("Cadastrando pedido.");
		
		//Aqui vou simular os dados como se tivessem chegados preenchidos do cliente. Vou apenas popular pedido e salvar.
		//O correto seria chegar como parâmetro no POST, porém como não temos um cliente, fiz essa simulação.
		PedidoItem pedido = pedidoItemRepository.populaPedidoItem();
		
		pedidoItemRepository.addPedido(pedido);
	}
}
