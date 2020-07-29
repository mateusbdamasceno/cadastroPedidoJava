package br.com.brasilprev.repository;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.brasilprev.beans.Pedido;

@Repository
public class PedidoRepositoryImp implements PedidoRepository{
	
	Logger logger = LoggerFactory.getLogger(PedidoRepositoryImp.class);
	
	@Autowired
	ClienteRepository clienteRepository;

	@Override
	public Pedido populaPedido() {
		logger.info("Populando pedido.");
		
		Pedido pedido = new Pedido();
		
		pedido.setIdPedido(1);
		pedido.setData(new Date());
		pedido.setCliente(clienteRepository.populaCliente());
		pedido.setStatus("Aprovado");
		pedido.setSessao("B12");
		
		return pedido;
	}

}
