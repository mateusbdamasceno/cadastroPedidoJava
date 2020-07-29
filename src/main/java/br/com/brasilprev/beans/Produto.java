package br.com.brasilprev.beans;

import lombok.Data;

@Data
public class Produto {
	private Integer idProduto;
	private Categoria categoria;
	private String produto;
	private Double preco;
	private Integer quantidade;
	private String descricao;
	//private 
}
