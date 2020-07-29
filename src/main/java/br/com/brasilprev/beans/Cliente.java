package br.com.brasilprev.beans;

import lombok.Data;

@Data
public class Cliente {
	private Integer idCliente;
	private String nome;
	private String email;
	private String senha;
	private String rua;
	private String cidade;
	private String bairro;
	private String cep;
	private String estado;

}
