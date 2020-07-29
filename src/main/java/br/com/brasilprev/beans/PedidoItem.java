package br.com.brasilprev.beans;

import lombok.Data;

@Data
public class PedidoItem {
	private Integer idItem;
	private Pedido pedido;
	private Produto produto;
	private String produtoDesc;
	private Integer quantidade;
	private Double valor;
	private Double subtotal;

}
