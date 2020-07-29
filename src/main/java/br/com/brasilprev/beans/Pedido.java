package br.com.brasilprev.beans;

import java.util.Date;

import lombok.Data;

@Data
public class Pedido {
	private Integer idPedido;
	private Cliente cliente;
	private Date data;
	private String status;
	private String sessao;
}
