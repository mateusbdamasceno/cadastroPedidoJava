package br.com.brasilprev.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.brasilprev.beans.Pedido;
import br.com.brasilprev.beans.PedidoItem;
import br.com.brasilprev.beans.Produto;

@Repository
public class PedidoItemRepositoryImp implements PedidoItemRepository {
	Logger logger = LoggerFactory.getLogger(PedidoItemRepositoryImp.class);
	
	@Autowired
	PedidoRepository pedidoRepository;
	
	@Autowired
	ProdutoRepository produtoRepository;

	@Override
	public PedidoItem populaPedidoItem() {
		logger.info("Populando um PedidoItem.");
		
		Pedido pedido = pedidoRepository.populaPedido();
		Produto produto = produtoRepository.populaProduto();
		
		PedidoItem pedidoItem = new PedidoItem();
		pedidoItem.setIdItem(1);
		pedidoItem.setPedido(pedido);
		pedidoItem.setProduto(produto);
		pedidoItem.setProdutoDesc("KIT");
		pedidoItem.setQuantidade(10);
		pedidoItem.setValor(25.0);
		pedidoItem.setSubtotal(250.0);
		
		return pedidoItem;
	}

	@Override
	public void addPedido(PedidoItem pedido) {
		// Aqui o peiddo seria adicionado no banco de dados usado na aplicação.
		
	}	

}
