package br.com.brasilprev.repository;

import br.com.brasilprev.beans.PedidoItem;

public interface PedidoItemRepository {
	
	public PedidoItem populaPedidoItem();

	public void addPedido(PedidoItem pedido);

}
